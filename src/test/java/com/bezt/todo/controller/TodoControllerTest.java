package com.bezt.todo.controller;

import com.bezt.todo.model.Todo;
import com.bezt.todo.service.TodoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TodoController.class)
class TodoControllerTest {

    @Mock
    private TodoService todoService;

    @InjectMocks
    private TodoController todoController;

    @Test
    void getAllTodos() throws Exception {
        when(todoService.getAllTodo()).thenReturn(Arrays.asList(new Todo("Task 1", false)));

        // Perform a GET request to "/todos"
        // Assert that the response has HTTP status 200 (OK)
    }

    // Add more tests for other controller methods...
}
