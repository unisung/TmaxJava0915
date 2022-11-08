package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StudentService;

public class InfoAction implements ActionCommand{
	  StudentService service =new StudentService();
	  
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getParameter("seq"));
		
		request.setAttribute("info", 
				   service.find(Integer.parseInt(request.getParameter("seq"))));
		
		
		return "/info.jsp";
	}

}
