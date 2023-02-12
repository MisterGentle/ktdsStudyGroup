package com.ktdsuniversity.edu.choty.service;

import java.util.List;

import com.ktdsuniversity.edu.choty.dao.MapMemberDAOImpl;
import com.ktdsuniversity.edu.choty.dao.MemberDAO;
import com.ktdsuniversity.edu.choty.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO;

	public MemberServiceImpl() {
		memberDAO = new MapMemberDAOImpl();
	}

	@Override
	public boolean create(MemberVO memberVO) {
		return memberDAO.create(memberVO) > 0;
	}

	@Override
	public List<MemberVO> readAll() {
		return memberDAO.readAll();
	}

	@Override
	public MemberVO read(int index) {
		return memberDAO.read(index);
	}

	@Override
	public MemberVO read(String valueOf) {
		return memberDAO.read(valueOf);
	}

}
