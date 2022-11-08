package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, ActionCommand> contList =null;

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화....");
		contList = new HashMap();
		contList.put("/student/list.do",new ListAction());
		contList.put("/student/info.do",new InfoAction());
		contList.put("/student/inputForm.do",new InputFormAction());
		contList.put("/student/insert.do",new InsertAction());
		
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri=request.getRequestURI();
		System.out.println("uri:"+uri);
		String conPath = request.getContextPath();
		System.out.println("conPath:"+conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command:"+command);
	     
		
		ActionCommand actionCommand = contList.get(command);
		System.out.println(actionCommand);
		
		
		String view=actionCommand.action(request, response);
		
		/*
		 * System.out.println(((view==null) |view.length()==0)?"리다이렉트":"포워드");
		 * if(((view==null) |view.length()==0)) response.sendRedirect(view);
		 */
	    
	    if(view.indexOf(":")>=0) {
	    	System.out.println("x");
	    	System.out.println("리다이렉트경로");
	    	view=view.substring(view.lastIndexOf("/")+1);
	    	response.sendRedirect(view);
	    	//response.sendRedirect("list.do");
	    }else {	
	    	System.out.println("y");
		RequestDispatcher dispatcher
		  = request.getRequestDispatcher(view);
		 dispatcher.forward(request, response);
	    }
	}

}
