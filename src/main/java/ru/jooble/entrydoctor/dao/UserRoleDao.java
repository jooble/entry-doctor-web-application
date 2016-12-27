package ru.jooble.entrydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jooble.entrydoctor.entity.UserRole;

public interface UserRoleDao extends JpaRepository<UserRole, Long> {
}
