package ru.jooble.entrydoctor.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity {
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
