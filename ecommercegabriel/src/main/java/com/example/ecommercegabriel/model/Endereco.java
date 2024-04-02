package com.example.ecommercegabriel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco extends BaseModel{
    private String logradouro;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;
}
