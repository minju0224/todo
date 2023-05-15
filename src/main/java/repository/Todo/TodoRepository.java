package repository.Todo;

import domain.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TodoRepository {
    @PersistenceContext
    private EntityManager em;

    public Todo save(Todo todo){
        em.persist(todo);
        return todo;
    }
    public Optional<Todo> findById(Long id){
        Todo todo = em.find(Todo.class, id);
        return Optional.ofNullable(todo);
    }
    public List<Todo> findAll(){
        return em.createQuery("select m from Todo m", Todo.class)
                .getResultList();
    }
}
