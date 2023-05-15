package repository.Todo;

import domain.Todo;

import java.util.Map;
import java.util.Optional;

public interface TodoRepo {
    Todo save(Todo todo);
    Optional<Todo> findById(Long id);
    Map<Long, Todo> findByAll();
}
