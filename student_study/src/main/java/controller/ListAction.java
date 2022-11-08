package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;

public class ListAction implements ActionCommand{
    StudentService service =new StudentService();
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("list", service.findAll());
		return "/list.jsp";
	}

}
