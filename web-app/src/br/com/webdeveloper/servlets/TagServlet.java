package br.com.webdeveloper.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.webdeveloper.tags.Employee;
import br.com.webdeveloper.tags.Person;

@WebServlet("/tagServlet")
public class TagServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
       System.err.println("inicializando tag servlet..... ");
	}
	 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 request.setAttribute("key", "Meu nome é Js...");
		 Person  employee  = new Employee (); 
          employee.setEmail(" contatos@aprovado.com.br");
          employee.setNome(" aprovado ");
		 request.setAttribute("person", employee );
		 List<String> mylist = new ArrayList<>();
		 mylist.add("A"); 
		 mylist.add("C"); 
		 mylist.add("D"); 
		 mylist.add("F");
		 request.setAttribute("mylist", mylist );
		 
		 Map<String, String> maymap = new HashMap<>();
		 maymap.put("1" ,"BSB"); 
		 maymap.put("2" ,"SP");
		 maymap.put("3" ,"PB");
		 maymap.put("4" ,"PE");
		
		 request.setAttribute("maymap", maymap );
		 
		 String [] indece = {"1","2","3","4"};
		 request.setAttribute("indece", indece );
		 
		 RequestDispatcher view = request.getRequestDispatcher("/tags.jsp");
		 view.forward(request, response);
		 
    }
	 
}
