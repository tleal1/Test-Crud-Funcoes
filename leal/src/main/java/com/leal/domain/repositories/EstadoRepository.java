package com.leal.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.leal.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}