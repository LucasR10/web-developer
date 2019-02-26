package br.com.webdeveloper.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webdeveloper.tags.Employee;
import br.com.webdeveloper.tags.Person;

@WebServlet("/env")
public class EnfreElServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
       System.err.println("inicializando tag servlet..... ");
	}
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 
		 RequestDispatcher view = request.getRequestDispatcher("/el.jsp");
		 view.forward(request, response);
		 
    }
	 
}
