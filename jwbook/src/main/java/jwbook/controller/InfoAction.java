package jwbook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoAction implements ActionCommand {

	@Override
	public String action(HttpServletRequest request, 
			             HttpServletResponse response) {
		return "/productInfo.jsp";
	}

}
