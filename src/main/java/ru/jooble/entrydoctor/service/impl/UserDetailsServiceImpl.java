package ru.jooble.entrydoctor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.jooble.entrydoctor.entity.User;
import ru.jooble.entrydoctor.service.UserService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final String ROLE_PREFIX = "ROLE_";

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.findUser(login);

        if (user == null) throw new UsernameNotFoundException("Username - " + login + "not found");

        Set<GrantedAuthority> roles = user.getRoles().stream().map(a -> new SimpleGrantedAuthority(ROLE_PREFIX + a.getName())).collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), roles);
    }
}
