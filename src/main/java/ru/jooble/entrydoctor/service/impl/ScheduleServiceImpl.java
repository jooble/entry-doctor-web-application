package ru.jooble.entrydoctor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.jooble.entrydoctor.dao.ScheduleDao;
import ru.jooble.entrydoctor.entity.Schedule;
import ru.jooble.entrydoctor.service.ScheduleService;

import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private ScheduleDao scheduleDao;

    @Override
    @Transactional(readOnly = true)
    public Schedule findSchedule(Long id) {
        return scheduleDao.findOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Schedule> findAll() {
        return scheduleDao.findAll();
    }

    @Override
    public void save(Schedule schedule) {
        scheduleDao.save(schedule);
    }

    @Override
    public void delete(Schedule schedule) {
        scheduleDao.save(schedule);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Schedule> getFreeScheduleByDoctor(Long doctorId) {
        return scheduleDao.findByDoctor(doctorId);
    }

    @Override
    public List<Schedule> findByUser(Long userId) {
        return scheduleDao.findByUser_Id(userId);
    }
}
