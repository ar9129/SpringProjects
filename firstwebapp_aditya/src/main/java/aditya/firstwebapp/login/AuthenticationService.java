package aditya.firstwebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
      public boolean authenticate(String username , String Password) {
    	  boolean isValidusername = username.equalsIgnoreCase("ADITYA") ;
    	  boolean isvalidPassword =   Password.equalsIgnoreCase("dummy") ;
    	  
    	  return isValidusername && isvalidPassword ;
    			 
      }
}
