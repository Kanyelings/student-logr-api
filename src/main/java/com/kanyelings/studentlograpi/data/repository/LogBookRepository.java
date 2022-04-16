package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.LogBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogBookRepository extends JpaRepository<LogBook, Long> {
}
