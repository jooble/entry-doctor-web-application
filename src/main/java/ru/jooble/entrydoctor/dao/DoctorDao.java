package ru.jooble.entrydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jooble.entrydoctor.entity.Doctor;

public interface DoctorDao extends JpaRepository<Doctor, Long> {
}
