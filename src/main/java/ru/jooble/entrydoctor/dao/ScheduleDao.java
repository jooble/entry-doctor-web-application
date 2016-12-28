package ru.jooble.entrydoctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.jooble.entrydoctor.entity.Schedule;

import java.util.List;

public interface ScheduleDao extends JpaRepository<Schedule, Long> {

    @Query(value = "SELECT s FROM Schedule s WHERE s.doctor.id = :doctorId AND (s.user.id IS NULL OR s.user.id = 0)")
    List<Schedule> findByDoctor(@Param("doctorId") Long doctorId);

    List<Schedule> findByUser_Id(Long userId);
}
