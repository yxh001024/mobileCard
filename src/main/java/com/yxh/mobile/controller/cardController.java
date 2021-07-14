package com.yxh.mobile.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yxh.mobile.entity.cardInfo;
import com.yxh.mobile.exception.BusinessException;
import com.yxh.mobile.service.CardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class cardController {
    @Resource
    private CardService cardService;

    @GetMapping("/")
    public ModelAndView showIndex() {
        return new ModelAndView("/index");
    }

    @GetMapping("/toLogin")
    public ModelAndView showLogin() {
        return new ModelAndView("/login");
    }

    @PostMapping("/login")
    @ResponseBody
    public Map login(String number,String password, String vc, HttpSession session) {
        String verifyCode = (String) session.getAttribute("verify_code");
        Map result = new HashMap();
        if (vc == null || verifyCode == null || !vc.equalsIgnoreCase(verifyCode)) {
            result.put("code", "V01");
            result.put("message", "验证码错误");
        } else {
            try {
                cardInfo cardInfo = cardService.loginCheck(number,password);
                session.setAttribute("login_user", cardInfo);
                result.put("code", "0");
                result.put("message", "success");
            } catch (BusinessException e) {
                e.printStackTrace();
                result.put("code", e.getCode());
                result.put("message", e.getMessage());
            }
        }
        return result;
    }

    @GetMapping("/toRegister")
    public ModelAndView showSign() {
        return new ModelAndView("/register");
    }

    @PostMapping("/register")
    public Map register(cardInfo cardInfo) {
        return new HashMap();
    }
}
