package com.manish.springboot.myfirstwebapp.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")

public class WelcomeController{
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String GoToWelcomePage(ModelMap model){
		  model.put("name","Aditya");
          return "welcome";
	}
}
//public class LoginController {
//
//
//private AuthenticationService auth;
//
//@Autowired
//public LoginController(AuthenticationService auth) {
//		super();
//		this.auth = auth;
//	}
//
//	
//	@RequestMapping(value="loginPage2", method=RequestMethod.GET)
//	public String GoTologinPage(){
//		
//          return "loginPage";
//	}
//	
//	@RequestMapping(value="loginPage2", method=RequestMethod.POST)
//	public String GoToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
//		
//		// AuthenticationService auth = new AuthenticationService(); --> created object manually to see if it's working
//	   
//		if(auth.authenticate(name, password)) {
//			model.put("name", name);
//			model.put("password", password);
//			return "welcome";
//		}
//		else {
//			model.put("errorMessage", "Invalid Username or Password");
//			return "loginPage";
//		}
//		
//
//		
//	}
//}
