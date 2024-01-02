package com.bezt.todo.service;

import com.bezt.todo.model.Todo;

import java.util.List;

public interface TodoService {
    Todo createNewTodo(Todo todo);

    List<Todo> getAllTodo();

    Todo findTodoById(Long id);

    List<Todo> findAllCompletedTodo();

    List<Todo> findAllInCompleteTodo();

    void deleteTodo(Todo todo);

    Todo updateTodo(Todo todo);
}
