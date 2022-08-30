package com.lti.nsp.repositories;

import com.lti.nsp.models.scholarship.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarshipRepository extends JpaRepository<Scholarship,Integer> {
}
