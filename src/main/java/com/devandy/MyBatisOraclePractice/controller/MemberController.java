package com.devandy.MyBatisOraclePractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.devandy.MyBatisOraclePractice.service.MemberService;
import com.devandy.MyBatisOraclePractice.vo.MemberVO;

import java.util.Date;

@Controller
public class MemberController{

    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public @ResponseBody List<MemberVO> selectListMembers() {
        List<MemberVO> allMembers = memberService.selectAllMembers();
        return allMembers;
    }


    @GetMapping("/")
    public String main() {
        return "helloJsp";
    }

}


