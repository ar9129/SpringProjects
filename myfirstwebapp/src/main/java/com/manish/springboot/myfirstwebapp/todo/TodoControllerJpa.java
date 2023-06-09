package com.manish.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
//@SessionAttributes("name")
public class TodoControllerJpa {

//	@Autowired
	private TodoService todoservice;

	private ToDoRepository todoRepository;

	public TodoControllerJpa(TodoService todoservice, ToDoRepository todoRepository) {
		super();
		this.todoservice = todoservice;
		this.todoRepository = todoRepository;
	}

	@RequestMapping(value = "list-todos", method = RequestMethod.GET)
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoRepository.findByUsername("in28minutes");
		model.addAttribute("todos", todos);
		return "listTodos";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodo(ModelMap model) {
		String username = (String) model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addTodoPage";
	}

	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addTodoPage";
		}
		String username = (String) model.get("name");
		todo.setUsername(username);
		todoRepository.save(todo);
		// todoservice.addTodo(username,todo.getDescription(), todo.getTargetDate(),
		// todo.isDone());

		return "redirect:list-todos";
	}

	@RequestMapping("delete-todo")
	public String deleteTodos(@RequestParam int id) {
		todoRepository.deleteById(id);
		// todoservice.deleteById(id);
		return "redirect:list-todos";
	}

//	@RequestMapping("update-todo")
//	public String updateTodos(ModelMap model, Todo todo) {
//		model.addAttribute("todo",todo) ;
//		todoservice.deleteById(id);
//		String username = (String)model.get("name") ;
//		todoservice.addTodo(username,todo.getDescription(), LocalDate.now().plusYears(1), false);
//		return "redirect:list-todos" ;
//	}

	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String updateTodos(@RequestParam int id, ModelMap model) {
		Todo todo = todoRepository.findById(id).get();
		model.addAttribute("todo", todo);
		return "addTodoPage";
	}

	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addTodoPage";
		}
		// String username = (String)model.get("name") ;
		todoRepository.save(todo);
		// todoservice.updateTodo(todo);
		return "redirect:list-todos";
	}

}