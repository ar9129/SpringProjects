package aditya.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
       // "say-hello" => "HELLO! What are you learning today"
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "HELLO! What are you learning today" ;
	}
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer() ;
		sb.append("<html>") ;
		sb.append("<head>") ;
		sb.append("<title>My first Html page</title>") ;
		sb.append("</head>") ;
		sb.append("<body>") ;
		sb.append("My first html page with body") ;
		sb.append("</body>") ;
		sb.append("</html>") ;
		
		
		return sb.toString() ;
	}
//	@RequestMapping("say-hello-jsp")
////	@ResponseBody
//	public String sayHelloJspf(@RequestParam String name, ModelMap model ) {
//		model.put("name", name) ;
//		return "sayHello" ;
//	}
	
}
