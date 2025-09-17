package com.projectrest.creatine.repository;

import com.projectrest.creatine.entities.Creatine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatineRepository extends JpaRepository<Creatine, Long> {

}
