package com.manish.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

//	@RequestMapping("/sayHello")
//	@ResponseBody
//	public String sayHello(){
//		return "Helllllllo, what are you learning today";
//	}
	
	@RequestMapping("/sayHelloHtml")
	@ResponseBody
	public String sayHelloHtml(){
		StringBuffer sb= new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("First HTML page with body");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();
	}
	
	// /myfirstwebapp/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/sayHelloJSP")
	public String sayHelloJSP(){
		return "sayHello to git";
	}
	
	
	
}
