package ru.jooble.entrydoctor.service;

import ru.jooble.entrydoctor.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor findDoctor(Long id);

    List<Doctor> findAll();

    void save(Doctor doctor);

    void delete(Doctor doctor);
}
