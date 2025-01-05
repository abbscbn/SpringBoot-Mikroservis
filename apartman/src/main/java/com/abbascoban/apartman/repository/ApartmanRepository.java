package com.abbascoban.apartman.repository;

import com.abbascoban.apartman.model.Apartman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmanRepository extends JpaRepository<Apartman, Long> {
}
