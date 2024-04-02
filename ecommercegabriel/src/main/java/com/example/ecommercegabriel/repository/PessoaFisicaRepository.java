package com.example.ecommercegabriel.repository;


import com.example.ecommercegabriel.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository  extends JpaRepository<PessoaFisica, Integer> {
}
