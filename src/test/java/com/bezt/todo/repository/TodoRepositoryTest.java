package com.bezt.todo.repository;

import com.bezt.todo.model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class TodoRepositoryTest {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    void findByCompletedTrue() {
        todoRepository.save(new Todo("Task 1", true));
        todoRepository.save(new Todo("Task 2", false));

        List<Todo> completedTodos = todoRepository.findByCompletedTrue();

        assertEquals(1, completedTodos.size());
        assertEquals("Task 1", completedTodos.get(0).getTodo());
    }

    // Add more tests for other repository methods...
}
