package com.regapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.regapp.model.DAOService;
import com.regapp.model.DAOServiceImpl;

@WebServlet("/listAll")
public class GetAllRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetAllRegistrationController() {
        super();   
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		DAOService service = new DAOServiceImpl();
	 service.connectionDB();
	 
	 ResultSet result = service.getAllReg(); 
	 
	 request.setAttribute("result", result);
	 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registrations.jsp");
	 rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	    	rd.forward(request, response);
	}
	}
}


