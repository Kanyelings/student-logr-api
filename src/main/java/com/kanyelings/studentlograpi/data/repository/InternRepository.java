package com.kanyelings.studentlograpi.data.repository;


import com.kanyelings.studentlograpi.data.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern, Long> {
}
