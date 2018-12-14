package com.itt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itt.dto.MemberVO;
import com.itt.service.MemberService;





@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/list")
	public String memberList(Model model){
		List<MemberVO> memList=new ArrayList<MemberVO>();
		try {
			memList=(List<MemberVO>)memberService.getMemberList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("memList", memList);
		return "member/all";
	} 
	
	
	
	
}
