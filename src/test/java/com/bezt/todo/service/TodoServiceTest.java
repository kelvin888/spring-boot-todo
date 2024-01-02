package com.bezt.todo.service;

import com.bezt.todo.model.Todo;
import com.bezt.todo.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TodoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoServiceImpl todoService;

    @Test
    void getAllTodo() {
        when(todoRepository.findAll()).thenReturn(Arrays.asList(new Todo("Task 1", false)));

        List<Todo> result = todoService.getAllTodo();

        assertEquals(1, result.size());
        assertEquals("Task 1", result.get(0).getTodo());
    }

    // Add more tests for other service methods...
}
