package br.com.webdeveloper.servlets.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class MyDogHttpSesionBaindingListner implements HttpSessionBindingListener {

	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("add  ");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Removeu da sessao ");
	}

}
