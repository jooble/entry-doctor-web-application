package ru.jooble.entrydoctor.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
