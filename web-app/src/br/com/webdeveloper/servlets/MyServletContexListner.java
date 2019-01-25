package br.com.webdeveloper.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyServletContexListner implements ServletContextListener {
	
	
	public static final String URL = "url_jdbc";
	@Override
	public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Abrindo conexao.." + sce.getServletContext().getMajorVersion());
        String user = sce.getServletContext().getInitParameter( MyServletConexaMysql.USER );
        String pass = sce.getServletContext().getInitParameter( MyServletConexaMysql.PASS );
        String url = "jdbc://localhost:3606/user="+user+"&pass="+pass;
        System.out.println("parametro.." + url );
        sce.getServletContext().setAttribute(URL, url);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	    System.out.println("Fecahndo conexao...");
	}

}
