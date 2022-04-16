package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.TermInternInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermInternInfoRepository extends JpaRepository<TermInternInfo, Long> {
}
