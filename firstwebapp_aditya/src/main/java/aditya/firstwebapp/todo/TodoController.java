package aditya.firstwebapp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
       // list-todos
	@Autowired
	
	private TodoService todoservice ;
	
//	public TodoController(TodoService todoservice) {
//		super();
//		this.todoservice = todoservice;
//	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoservice.findByUsername("ADITYA") ;
		model.addAttribute("todos" , todos) ;
		return "listTodos" ;
	}
	
}
