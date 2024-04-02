package com.example.ecommercegabriel.repository;


import com.example.ecommercegabriel.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Integer> {
}
