package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Spaces;

@Repository
public interface SpacesRepository extends JpaRepository<Spaces, Long> {
}