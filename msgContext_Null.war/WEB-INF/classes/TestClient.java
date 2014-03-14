package com.redhat;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("http://localhost:8080/msgContext_Null/HelloWS?wsdl");
		QName serviceName = new QName("http://redhat.com/",
				"HelloWSImplService");
		Service service = Service.create(url, serviceName);
		HelloWS port = service.getPort(HelloWS.class);
		port.sayHi();
	}

}
