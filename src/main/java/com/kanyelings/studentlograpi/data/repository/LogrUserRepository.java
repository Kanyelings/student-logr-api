package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.LogrUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogrUserRepository extends JpaRepository<LogrUser, Long> {
}
