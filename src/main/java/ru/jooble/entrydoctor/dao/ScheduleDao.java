package ru.jooble.entrydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jooble.entrydoctor.entity.Schedule;

public interface ScheduleDao extends JpaRepository<Schedule, Long> {
}
