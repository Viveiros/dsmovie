package com.viveirosandre.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viveirosandre.dsmovie.entities.Score;
import com.viveirosandre.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK>{

}
