package com.abbascoban.daireapp.repository;

import com.abbascoban.daireapp.model.Uye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UyeRepository extends JpaRepository<Uye, Long> {
}
