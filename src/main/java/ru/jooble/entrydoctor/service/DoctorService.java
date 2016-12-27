package ru.jooble.entrydoctor.service;

import ru.jooble.entrydoctor.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor findUser(Long id);

    List<Doctor> findAll();

    void save(Doctor doctor);

    void delete(Doctor doctor);
}
