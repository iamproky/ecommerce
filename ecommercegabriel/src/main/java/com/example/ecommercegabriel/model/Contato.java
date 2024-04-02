package com.example.ecommercegabriel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Pessoa pessoa;
    private List<Email> emails;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;
}
