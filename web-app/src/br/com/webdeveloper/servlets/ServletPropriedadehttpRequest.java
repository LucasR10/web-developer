
package br.com.webdeveloper.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "getreq", description = "Ler parametros do wb xml", urlPatterns = { "/getreq" })
public class ServletPropriedadehttpRequest extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServletPropriedadehttpRequest() {
      
    }


	public void init(ServletConfig config) throws ServletException {
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write(" request.getContentType() : " + request.getContentType()+"<br>" );
		response.getWriter().write(" getContextPath() : " + request.getContextPath()+"<br>" );
		response.getWriter().write(" request.getLocalAddr() : " + request.getLocalAddr()+"<br>" );
		response.getWriter().write(" request.isAsyncSupported() : " + request.isAsyncSupported()+"<br>" );
		response.getWriter().write(" request.getLocalName() : " + request.getLocalName()+"<br>");
		response.getWriter().write(" request.getServerPort() : " + request.getServerPort() +"<br>");
		response.getWriter().write(" request.getServerName() : " + request.getServerName() +"<br>");
		response.getWriter().write(" request.getMethod() : " + request.getMethod()+"<br>" );
		response.getWriter().write(" request.getRemoteAddr() : " + request.getRemoteAddr()+"<br>" );
		response.getWriter().write(" request.getAuthType() : " + request.getAuthType()+"<br>" );
		
		request.getServletContext().log("info erro pege.");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
