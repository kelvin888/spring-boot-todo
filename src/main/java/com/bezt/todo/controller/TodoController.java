package com.bezt.todo.controller; 
  
import com.bezt.todo.model.Todo; 
import com.bezt.todo.service.TodoService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*; 
  
import java.util.List; 
  
@RestController
@RequestMapping("/todos") 
public class TodoController { 
  
    @Autowired
    private TodoService todoService; 
    
    @GetMapping("/") 
    public ResponseEntity<List<Todo>> getAllTodos() { 
        return ResponseEntity.ok(todoService.getAllTodo()); 
    } 
    @GetMapping("/completed") 
    public ResponseEntity<List<Todo>> getAllCompletedTodos() { 
        return ResponseEntity.ok(todoService.findAllCompletedTodo()); 
    } 
    @GetMapping("/incomplete") 
    public ResponseEntity<List<Todo>> getAllIncompleteTodos() { 
        return ResponseEntity.ok(todoService.findAllInCompleteTodo()); 
    } 
    @PostMapping("/") 
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) { 
        return ResponseEntity.ok(todoService.createNewTodo(todo)); 
    } 
    @PutMapping("/{id}") 
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todo) { 
        todo.setId(id); 
        return ResponseEntity.ok(todoService.updateTodo(todo)); 
    } 
   
}