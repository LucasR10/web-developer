package br.com.webdeveloper.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomizandoTags extends SimpleTagSupport {

	private String faixa ;

	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}
	
	
	@Override
	public void doTag() throws JspException, IOException {
	  this.getJspContext().getOut().write(" Hello "+ this.faixa +" <br>");
	}
}
