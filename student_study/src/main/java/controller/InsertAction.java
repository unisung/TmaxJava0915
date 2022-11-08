package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import model.Student;
import service.StudentService;

public class InsertAction implements ActionCommand{
	  StudentService service =new StudentService();
	  
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("seq"));
		Student s = new Student();
		//s.setName(request.getParameter("name"));
		//s.setSchool(request.getParameter("school"));
		//s.setBirth(request.getParameter("birth"));
		//s.setEmail(request.getParameter("email"));
		//name=홍길동&school=AA대학교&birth=2001-01-01&email&aa@aa.com
		try {
			BeanUtils.populate(s, request.getParameterMap());
		}catch(Exception e) {
			e.printStackTrace();
		}
		//
		//service.insertStudent(s);
		System.out.println("리다이렉트로 이동");
		/*
		 * try { response.sendRedirect("/student/list.do"); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		return "redirect:/student/list.do";
	}
}
