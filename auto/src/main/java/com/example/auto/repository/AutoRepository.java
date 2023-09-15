package com.example.auto.repository;

import com.example.auto.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    List<Auto> findByProprietarioId(Long proprietarioId);
}
