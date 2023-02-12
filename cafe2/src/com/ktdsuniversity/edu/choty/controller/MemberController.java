package com.ktdsuniversity.edu.choty.controller;

import java.util.List;

import com.ktdsuniversity.edu.choty.service.MemberService;
import com.ktdsuniversity.edu.choty.service.MemberServiceImpl;
//import com.ktdsuniversity.edu.choty.service.SecondMemberServiceImpl; //리스트
import com.ktdsuniversity.edu.choty.vo.MemberVO;

public class MemberController {

	public static void main(String[] args) {

		MemberService service = new MemberServiceImpl(); 
		//MemberService service = new SecondMemberServiceImpl(); // 리스트 사용

		MemberVO member = new MemberVO();
		member.setId("id1");
		member.setPassword("pwd1");
		member.setReadNumber(1);
		member.setPageNumber(0);
		service.create(member);

		member = new MemberVO();
		member.setId("id2");
		member.setPassword("pwd2");
		member.setReadNumber(2);
		member.setPageNumber(0);
		service.create(member);

		member = new MemberVO();
		member.setId("id3");
		member.setPassword("pwd3");
		member.setReadNumber(3);
		member.setPageNumber(0);
		service.create(member);

		List<MemberVO> memberList = service.readAll();
		for(MemberVO eachMember: memberList) {
			System.out.println(eachMember.getId());
			System.out.println(eachMember.getPassword());
			System.out.println(eachMember.getReadNumber());
			System.out.println(eachMember.getPageNumber());
		}
		if(service.read("id1")!=null) {
			System.out.println("id중 1건만 가져옵니다.");
			System.out.println(service.read("id1").getId());
			System.out.println(service.read("id1").getPassword());
			System.out.println(service.read("id1").getReadNumber());
			System.out.println(service.read("id1").getPageNumber());
			}
		}

	}