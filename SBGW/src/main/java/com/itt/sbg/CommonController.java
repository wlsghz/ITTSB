package com.itt.sbg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comes")
public class CommonController {

	@RequestMapping("/loginForm")
	public String loginGet() throws Exception{
		return "/comes/login";
	}
}
