package com.andreitoledo.springmvc.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreitoledo.springmvc.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

}
