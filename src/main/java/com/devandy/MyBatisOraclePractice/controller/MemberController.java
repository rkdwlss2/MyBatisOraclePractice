package com.devandy.MyBatisOraclePractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping("/api/hello")
    public @ResponseBody String hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }

    @GetMapping("/")
    public String main() {
        return "helloJsp";
    }

}