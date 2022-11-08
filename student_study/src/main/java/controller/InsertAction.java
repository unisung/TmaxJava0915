package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;

public class InsertAction implements ActionCommand{
	  StudentService service =new StudentService();
	  
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("seq"));
		
		
		return "/student/list.do";
	}

}
