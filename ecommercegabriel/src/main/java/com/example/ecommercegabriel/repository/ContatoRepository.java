package com.example.ecommercegabriel.repository;


import com.example.ecommercegabriel.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
