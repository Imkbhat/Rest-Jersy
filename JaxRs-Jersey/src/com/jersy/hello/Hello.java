package com.jersy.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	
	//Simple String
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello From String"; 
	}
	

	//Using XML
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>"; 
	}
	
	//Using HTML
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
		        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> "; 
	}
}
