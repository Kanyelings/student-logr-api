package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.LogBookDayRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogBookDayRecordRepository extends JpaRepository<LogBookDayRecord, Long> {
}
