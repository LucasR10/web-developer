package br.com.webdeveloper.servlets.listner;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class HttpSessionBindingListnerTeste implements HttpSessionBindingListener {

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println(" Value Bound - " + event.getValue() );
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println(" valueUnbound - " + event.getValue() );
	}

}
