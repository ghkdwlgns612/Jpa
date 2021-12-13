package com.example.nplus1.repository;


import com.example.nplus1.domain.Academy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AcademyRepository extends JpaRepository<Academy, Long> {

    @Query("SELECT a FROM Academy a JOIN FETCH a.subjects")
    List<Academy> findAllJoinFetch();
}
