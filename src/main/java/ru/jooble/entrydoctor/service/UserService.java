package ru.jooble.entrydoctor.service;

import ru.jooble.entrydoctor.entity.User;

import java.util.List;

public interface UserService {

    User findUser(String login);

    User findUser(Long id);

    List<User> findAll();

    void save(User user);

    void delete(User user);
}
