package com.viveirosandre.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viveirosandre.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{

}
