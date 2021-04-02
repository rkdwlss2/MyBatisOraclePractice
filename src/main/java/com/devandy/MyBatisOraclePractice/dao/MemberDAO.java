package com.devandy.MyBatisOraclePractice.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.devandy.MyBatisOraclePractice.vo.MemberVO;

@Mapper
public interface MemberDAO {
    public List<MemberVO> selectAllMembers();
}