package ru.jooble.entrydoctor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.jooble.entrydoctor.dao.UserDao;
import ru.jooble.entrydoctor.entity.User;
import ru.jooble.entrydoctor.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public User findUser(Long id) {
        return userDao.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User findUser(String login) {
        return userDao.findTop1ByLogin(login);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
