package com.bezt.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezt.todo.model.Todo;
import com.bezt.todo.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo createNewTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findTodoById(Long id) {
        return todoRepository.getById(id);
    }

    @Override
    public List<Todo> findAllCompletedTodo() {
        return todoRepository.findByCompletedTrue();
    }

    @Override
    public List<Todo> findAllInCompleteTodo() {
        return todoRepository.findByCompletedFalse();
    }

    @Override
    public void deleteTodo(Todo todo) {
        todoRepository.delete(todo);
    }

    @Override
    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }
}
