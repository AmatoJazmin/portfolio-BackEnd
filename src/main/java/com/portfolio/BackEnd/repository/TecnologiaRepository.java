package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository <Tecnologia, Long> {
    
}
