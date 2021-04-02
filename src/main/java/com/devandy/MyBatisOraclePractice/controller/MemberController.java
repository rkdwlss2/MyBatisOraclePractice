package com.devandy.MyBatisOraclePractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devandy.MyBatisOraclePractice.service.MemberService;
import com.devandy.MyBatisOraclePractice.vo.MemberVO;

@Controller
public class MemberController{

    @Autowired
    MemberService memberService;

    @GetMapping("/members")
    public @ResponseBody List<MemberVO> selectListMembers() {
        List<MemberVO> allMembers = memberService.selectAllMembers();
        return allMembers;
    }
}