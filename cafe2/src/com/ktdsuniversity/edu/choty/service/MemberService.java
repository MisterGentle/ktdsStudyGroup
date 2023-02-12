package com.ktdsuniversity.edu.choty.service;

import java.util.List;

import com.ktdsuniversity.edu.choty.vo.MemberVO;

public interface MemberService {

	public boolean create(MemberVO memberVO);

	public List<MemberVO> readAll();

	public MemberVO read(int index);

	public MemberVO read(String valueOf);
}