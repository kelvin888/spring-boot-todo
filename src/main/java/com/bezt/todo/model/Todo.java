package com.bezt.todo.model; 
  
import jakarta.persistence.*;
import lombok.NoArgsConstructor; 
  
@Entity
@Table(name = "mytodos", schema = "todo")
@NoArgsConstructor
public class Todo { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // this is the primary key which will be auto generated 
    private Long id; 
    private String todo; 
    private boolean completed; 
  
    public Todo(String todo, boolean completed) { 
        this.todo = todo; 
        this.completed = completed; 
    } 
    public Long getId() { 
        return id; 
    } 
    public void setId(Long id) { 
        this.id = id; 
    } 
    public String getTodo() { 
        return todo; 
    } 
    public void setTodo(String todo) { 
        this.todo = todo; 
    } 
    public boolean isCompleted() { 
        return completed; 
    } 
    public void setCompleted(boolean completed) { 
        this.completed = completed; 
    } 
} 