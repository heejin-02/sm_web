package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.smhrd.database.SqlSessionManager;

public class MemberDAO {

	// Java랑 Mybatis를 연결하는 역할 수행
	// 회원가입) 사용자가 입력한 값들을 받아서 Mybatis를 통해 DB의 테이블에 넣어주는 작업
	SqlSessionFactory sessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(MavenMember member) {
		// 1. factory를 통해서 sqlSession을 생성
		SqlSession sqlSession = sessionFactory.openSession(true);
		
		// 매개변수(어떤 sql문, 넘겨줄 값)
		int res = sqlSession.insert("com.smhrd.database.MemberMapper.join", member);
		
		// 세션 사용 후 자원 반환 
		sqlSession.close();
		
		return res;
	}

}
