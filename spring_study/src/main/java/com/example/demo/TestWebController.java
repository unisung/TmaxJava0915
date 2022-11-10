package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/test")
public class TestWebController {
 
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "msg", required = false) String msg, Model m) {
		// String msg = request.getParameter("msg");
		m.addAttribute("msg",msg);
		return "hello";
		/* "/WBE-INF/views/" + "hello" +".jsp"
		 *  -> /WBE-INF/views/hello.jsp"
		 *  */
	}
	
	//@Controller에서 RESTfull서비스 제공 - @ResponseBody 사용
	@GetMapping("/hello/{msg}")
	@ResponseBody
	public String hello2(@PathVariable String msg) {
		return msg;
	}
	
	@GetMapping("/hello3/{msg}")
	public String hello3(@PathVariable String msg, Model m) {
		m.addAttribute("msg",msg);
		return "hello";
	}
}
