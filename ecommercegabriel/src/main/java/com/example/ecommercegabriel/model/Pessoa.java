package com.example.ecommercegabriel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa extends BaseModel{
    private String nome;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private PessoaFisica pessoaFisica;
    private PessoaJuridica pessoaJuridica;
    public List<Contato> contatos;
}
