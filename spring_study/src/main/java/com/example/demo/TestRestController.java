package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestRestController {
	
	@GetMapping("/hello")/*  /api/hello/ */
	public String hello(@RequestParam(value="msg", required = false ) String msg) {
	  return msg;	
	}
	
	@GetMapping("/hello2") /*/api/hello2/ */
	public Map<String,String> hello3(){
		Map<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "30");
		map.put("국적", "대한민국");
		
		return map;
	}

}
