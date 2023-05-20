package aditya.firstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
       private static List<Todo> todos = new ArrayList<>()  ;
       static {
    	   todos.add(new Todo(1, "ADITYA","learn AWS",LocalDate.now().plusYears(1), false)) ;
    	   todos.add(new Todo(2, "ADITYA","learn DevOPS",LocalDate.now().plusYears(2), false)) ;
    	   todos.add(new Todo(3, "ADITYA","learn full stack",LocalDate.now().plusYears(3), false)) ;
    	   
       }
       public static List<Todo> findByUsername(String username){
    	   return todos  ;
       }
       
}
