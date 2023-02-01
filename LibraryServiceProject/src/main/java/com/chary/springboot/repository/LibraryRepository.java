package com.chary.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chary.springboot.entities.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
