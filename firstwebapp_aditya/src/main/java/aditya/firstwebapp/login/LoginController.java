package aditya.firstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.classic.Logger;

@Controller
@SessionAttributes("name")
public class LoginController {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass()) ;
    
    @Autowired
    private AuthenticationService authenticationService ;
	
	@RequestMapping(value="login2",method= RequestMethod.GET)
	public String gotoLoginPage() {
		return "login2" ;
	}
	
	
	@RequestMapping(value="login2",method= RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
		model.put("name", name) ;
		model.put("Password", password);
		
		//Authentication
		//name- in28minutes
		// password- dummy
		
		return "welcome" ;
	}
		model.put("errorMessage", "Invalid Credentials! PLease try again.");
		return "login2" ;
	}
	
}








//public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//logger.info("i want this at info level {}" , name);
//model.put("name", name);
//System.out.println("Request Param iss "+name);
//return "login" ;
//}