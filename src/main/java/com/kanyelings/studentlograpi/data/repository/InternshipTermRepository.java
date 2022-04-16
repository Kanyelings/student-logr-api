package com.kanyelings.studentlograpi.data.repository;

import com.kanyelings.studentlograpi.data.entity.InternshipTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternshipTermRepository extends JpaRepository<InternshipTerm, Long> {
}
