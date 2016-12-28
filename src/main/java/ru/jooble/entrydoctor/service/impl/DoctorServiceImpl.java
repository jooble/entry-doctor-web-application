package ru.jooble.entrydoctor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.jooble.entrydoctor.dao.DoctorDao;
import ru.jooble.entrydoctor.entity.Doctor;
import ru.jooble.entrydoctor.service.DoctorService;

import java.util.List;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    @Override
    @Transactional(readOnly = true)
    public Doctor findDoctor(Long id) {
        return doctorDao.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }

    @Override
    public void save(Doctor doctor) {
        doctorDao.save(doctor);
    }

    @Override
    public void delete(Doctor doctor) {
        doctorDao.delete(doctor);
    }
}
