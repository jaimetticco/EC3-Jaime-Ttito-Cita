package com.admin.ec3jaimettitocita.repository;

import com.admin.ec3jaimettitocita.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
