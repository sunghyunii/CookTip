package com.example.demo.controller;

import com.example.demo.dto.UploadResultDTO;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import net.coobird.thumbnailator.Thumbnails;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
public class UploadController {
    //@Vaule: 의존성 주입 기능 중 하나
    //프로퍼티 파일, 환경 변수, 시스템 프로퍼티 등에서 값을 읽어와 필드에 주입할 때 사용
    //org.zerock.upload.path라는 키를 가진 프로퍼티 값을 찾아 uploadPath 에 주입
    @Value("${org.zerock.upload.path}")
    private String uploadPath;

    //여러 파일을 동시에 업로드
    @GetMapping("/uploadAjax")
    public ResponseEntity<List<UploadResultDTO>> uploadFile(MultipartFile[] uploadFiles) throws IOException {
        //업로드 결과를 저장할 리스트 초기화
        List<UploadResultDTO> resultDTOList = new ArrayList<>();
        for (MultipartFile uploadFile : uploadFiles) {
            //각 파일의 MIME 타입을 확인하여 이미지 파일인지 검사
            //MIME 타입: 다양한 인터넷 프로토콜에서 파일과 데이터를 식별하는데 사용
            //ex image/jpeg: JPEG 이미지 파일을 나타낸다
            if (uploadFile.getContentType().startsWith("image") == false) {
                log.warn("this file is not image type");
                //이미지가 아닌 파일이 포함된 경우, http 403 forbidden 상태 코드와 함꼐 응답을 반환
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
            //실제 파일 이름 IE 나 Edge는 전체 경로가 들어오므로
            //원본 이름 가져오기
            String originalName = uploadFile.getOriginalFilename();
            //lastIndexOf("\\") 을 사용하여 마지막 백슬래시의 위치를 찾는다.
            //substring()을 사용하여 마지막 백슬래시 다음부터 문자열 끝까지 추출
            //이렇게 하면 전체 경로에서 파일 이름만 추출할 수 있다
            String fileName = originalName.substring(originalName.lastIndexOf("\\")+1);
            log.info("fileName: " + fileName);

            //날짜 폴더 생성
            String folderPath = makeFolder();

            //UUID: 파일명의 중복을 방지하고 각 파일을 고유하게 식별하는 데 사용
            String uuid = UUID.randomUUID().toString();
            //파일 저장 경로 생성
            //folderPath: makeFolder에서 만든 날짜 기반 폴더 경로
            String saveName = uploadPath + File.separator+ folderPath + File.separator +
                    uuid + "_" + fileName;
            //Paths.get(): 문자열 경로를 Path 객체로 변환
            Path savePath = Paths.get(saveName);
            try{
                //파일저장
                //uploadFile(MultipartFile 객체)의 내용을 savePath 에 지정된 위치로 전송
                uploadFile.transferTo(savePath);
                //썸네일 생성
                String thumbnailSaveName = uploadPath +File.separator + folderPath + File.separator +
                        "s_" + uuid + "_" + fileName;
                File thumbnailFile = new File(thumbnailSaveName);
                //원본 이미지 파일(savePath.toFile()) 을 읽어서 새파일 (thumbnailFile)에 100x100 크기의
                //썸네일 생성
                Thumbnailator.createThumbnail(savePath.toFile(), thumbnailFile, 100, 100);
                //업로드 결과 정보를 dto 객체로 생성하여 리스트에 추가
                resultDTOList.add(new UploadResultDTO(fileName, uuid, folderPath));

            }catch(IOException e){
                e.printStackTrace();
            }

        }
        return new ResponseEntity<>(resultDTOList, HttpStatus.OK);
    }
    private String makeFolder(){
        //현재 날짜를 yyyy/MM/dd 형식의 문자열로 변환
        String str = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        //"//" 를 시스템의 파일 구분자로 변경
        //File.separator 는 운영 체제에 따라 적절한 구분자를 사용(window: "", unix/linus: "/")
        String folderPath = str.replace("//", File.separator);
        //uploadPath 와 folderPath 를 결합하여 전체 경로를 생성
        File uploadPathFolder = new File(uploadPath, folderPath);
        //폴더가 존재하지 않으면 mkdirs() 를 사용하여 만든다
        if(uploadPathFolder.exists() == false){
            uploadPathFolder.mkdirs();
        }
        return folderPath;
    }
}

