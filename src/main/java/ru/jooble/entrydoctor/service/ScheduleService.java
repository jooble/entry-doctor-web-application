package ru.jooble.entrydoctor.service;

import ru.jooble.entrydoctor.entity.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule findSchedule(Long id);

    List<Schedule> findAll();

    void save(Schedule schedule);

    void delete(Schedule schedule);

    List<Schedule> getFreeScheduleByDoctor(Long doctorId);

    List<Schedule> findByUser(Long userId);
}

