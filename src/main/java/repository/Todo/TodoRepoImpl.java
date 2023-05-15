package repository.Todo;

import domain.Todo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TodoRepoImpl implements TodoRepo{
    private static Map<Long,Todo> store = new HashMap<>();
    private static Long sequence = 0L; // long 타입으로 변환시켜줘야함

    @Override
    public Todo save(Todo todo) {
        todo.setId(++sequence);
        store.put(todo.getId(),todo);
        return todo;
    }
    @Override
    public Optional<Todo> findById(Long id) {
        return Optional.empty();
    }
    @Override
    public Map<Long, Todo> findByAll() {
        return null;
    }
}
