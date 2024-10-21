package com.pe.certus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.certus.entity.Employeer;

@Repository
public interface EmployeerRepository extends JpaRepository<Employeer, Long>{
	
}
