package com.redhat;

import java.util.logging.Logger;
import javax.jws.WebService;
import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class HelloWSImpl implements HelloWS{

	@Resource
	private WebServiceContext context;
	private Logger log =Logger.getLogger(this.getClass().getName());
	
	public void sayHi(){
		MessageContext msgctx=context.getMessageContext();
		log.info("Message Context retuned is : " + msgctx);
		
		Person.sayHello("Viral");
		
		msgctx=context.getMessageContext();
		log.info("Message Context now is : " + msgctx);
	}
}
