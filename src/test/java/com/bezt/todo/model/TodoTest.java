package com.bezt.todo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoTest {

    @Test
    void createTodo() {
        Todo todo = new Todo("Task 1", false);

        assertEquals("Task 1", todo.getTodo());
        assertEquals(false, todo.isCompleted());
    }

    // Add more tests for other model methods...
}
