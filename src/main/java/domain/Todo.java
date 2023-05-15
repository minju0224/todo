package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.java.LocalDateJavaType;

import java.time.LocalDateTime;


@Entity @Getter @Setter
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //기본키를 자동생성, 자동으로 DB에 추가
    private Long id;
    private String item;
    private Boolean isDone;
    private LocalDateTime createdDate;
    private LocalDateTime upDatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Boolean getisDone() {
        return isDone;
    }

    public void setisDone(Boolean isDone) {
        this.isDone = isDone;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpDatedDate() {
        return upDatedDate;
    }

    public void setUpDatedDate(LocalDateTime upDatedDate) {
        this.upDatedDate = upDatedDate;
    }
}
