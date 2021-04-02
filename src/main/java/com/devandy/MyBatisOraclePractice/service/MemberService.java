package com.devandy.MyBatisOraclePractice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devandy.MyBatisOraclePractice.dao.MemberDAO;
import com.devandy.MyBatisOraclePractice.vo.MemberVO;

@Service
public class MemberService {

    @Autowired
    MemberDAO memberDao;

    public List<MemberVO> selectAllMembers() {
        return memberDao.selectAllMembers();
    }
}