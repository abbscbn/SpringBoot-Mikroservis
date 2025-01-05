package com.abbascoban.daireapp.repository;

import com.abbascoban.daireapp.model.Daire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaireRepository  extends JpaRepository<Daire, Long> {
}
