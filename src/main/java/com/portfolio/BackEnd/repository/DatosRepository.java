package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepository extends JpaRepository <Datos, Long> {
    
}
