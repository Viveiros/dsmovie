package com.viveirosandre.dsmovie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.viveirosandre.dsmovie.dto.MovieDTO;
import com.viveirosandre.dsmovie.entities.Movie;
import com.viveirosandre.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		//Page<Movie> result = repository.findAll(pageable); 
		Page<Movie> result = repository.findAll(PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by(Sort.Direction.ASC, "title")));
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie result = repository.findById(id).get(); 
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
