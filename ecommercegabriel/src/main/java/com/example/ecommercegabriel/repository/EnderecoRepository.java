package com.example.ecommercegabriel.repository;


import com.example.ecommercegabriel.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Integer> {
}
