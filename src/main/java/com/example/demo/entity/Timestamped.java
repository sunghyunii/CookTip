package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
//엔티티의 생성 및 수정 이벤트를 감지
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class Timestamped {
    //등록 시간
    //엔티티가 생성된 날짜와 시간을 자동으로 기록할 때 사용
    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    //수정 시간
    //엔티티가 마지막으로 수정된 날짜와 시간을 자동으로 기록
    @LastModifiedDate
    @Column(name ="modddate")
    private LocalDateTime modDate;

}
