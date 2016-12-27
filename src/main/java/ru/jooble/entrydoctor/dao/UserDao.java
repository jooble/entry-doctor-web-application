package ru.jooble.entrydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jooble.entrydoctor.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

    User findTop1ByLogin(String login);
}
