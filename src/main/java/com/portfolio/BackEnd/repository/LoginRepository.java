package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
    
}
