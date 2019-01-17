package br.com.webdeveloper.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "remover", description = "remoer intes sessio", urlPatterns = { "/remover" }, 
initParams={@WebInitParam(name = "foo", value = "Hello "), @WebInitParam(name = ServletBindingListener.EMAIL, value = " World!") })
public class ServletBindingListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public static final String EMAIL = "email";
   
     Integer i = 0;
  
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       System.out.println(" Remover ");
        String param = request.getParameter("ok");
       
	        if( param != null && !param.equals("remover")){
	        	if( request.getSession().getAttribute("valor") != null ){
	            request.getSession().setAttribute("valor", i );
	        	int val = Integer.parseInt( request.getSession().getAttribute("valor").toString() );
	        	 
	        	}
	             response.getWriter().append("valor - ").append(i+"");
	         }else{
	        	 request.getSession().removeAttribute("valor");
	        	 response.getWriter().append("valor - ").append( request.getSession().getAttribute("valor")+"" );
	         }
        }
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
