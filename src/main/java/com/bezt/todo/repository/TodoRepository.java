package com.bezt.todo.repository; 
  
import com.bezt.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
  
import java.util.List; 
  
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> { 
    public Todo findByTodo(String todo); 
    public List<Todo> findByCompletedTrue(); 
    public List<Todo> findByCompletedFalse(); 
    public List<Todo> findAll(); 
    public Todo getById(Long id); 
} 