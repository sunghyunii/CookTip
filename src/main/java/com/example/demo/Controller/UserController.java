package com.example.demo.controller;

import com.example.demo.dto.HealthInfoDTO;
import org.springframework.ui.Model;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
@Log4j2
@RequiredArgsConstructor //자동 주입을 위한 Annotation
public class UserController {
    @Autowired
    private final UserService userService;
    //회원 정보 보기
    @GetMapping({"/UserInfo","/UserModifyForm"} )
    public void userInfo(Long id, Model model) {
        UserDTO userDTO =  userService.userInfoRead(id);
        model.addAttribute("userDTO", userDTO);

    }
    //회원 쿡 정보 보기
    @GetMapping({"/userCookInfo","/userCookModifyForm"} )
    public void userCookInfo(Long id, Model model) {
        HealthInfoDTO _health_infoDTO =  userService.cookInfoRead(id);
        model.addAttribute("user_health_infoDTO", _health_infoDTO);
    }
    //회원 정보 수정
    @PostMapping("/UserModifyForm")
    public String userModify(UserDTO userDTO, RedirectAttributes redirectAttributes) throws Exception {
        userService.modify(userDTO);
        redirectAttributes.addFlashAttribute("user_id", userDTO.getId());
        return "redirect:/user/UserModifyForm";
    }
    //회원 쿡정보 수정
    @PostMapping( "/userCookModifyForm")
    public String userCookModify(HealthInfoDTO _health_infoDTO, RedirectAttributes redirectAttributes) throws Exception {
        userService.modify(_health_infoDTO);
        redirectAttributes.addFlashAttribute("user_health_info_id", _health_infoDTO.getHealthInfoId());
        return "redirect:/user/userCookModifyForm";
    }
}