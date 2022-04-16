package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.TermCompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TermCompanyInfoRepository extends JpaRepository<TermCompanyInfo, Long> {
}
