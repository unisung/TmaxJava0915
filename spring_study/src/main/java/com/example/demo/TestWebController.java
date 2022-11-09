package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestWebController {
 
	@GetMapping("/hello")
	public String hello() {
		return "hello";
		/* "/WBE-INF/views/" + "hello" +".jsp"
		 *  -> /WBE-INF/views/hello.jsp"
		 *  */
	}
	
	@GetMapping("/hello3/{msg}")
	public String hello3(@PathVariable String msg, Model m) {
		m.addAttribute("msg",msg);
		return "hello";
	}
}
