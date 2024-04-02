package com.example.ecommercegabriel.repository;


import com.example.ecommercegabriel.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository  extends JpaRepository<PessoaJuridica, Integer> {
}
