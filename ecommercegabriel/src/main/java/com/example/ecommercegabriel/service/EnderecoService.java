package com.example.ecommercegabriel.service;


import com.example.ecommercegabriel.Interface.IService;
import com.example.ecommercegabriel.model.Endereco;
import com.example.ecommercegabriel.repository.EnderecoRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class EnderecoService implements IService<Endereco, Integer> {
    @Autowired //injeção de dependência
    private EnderecoRepository enderecoRepository;


    @Override
    @Transactional
    public Endereco create(Endereco entity) {
        log.info("Acessando método EnderecoService.create");
        log.debug("Valores recebidos: {}", entity);

        return enderecoRepository.save(entity);
    }

    @Override
    public List<Endereco> read() {
        log.info("Acessando método EnderecoResource.read()");

        List<Endereco> lista = enderecoRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Endereco read(Integer id) {
        log.info("Acessando método EnderecoResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Endereco enderecoEncontrado = enderecoRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public Endereco update(Integer id, Endereco entity) {
        log.info("Acessando método EnderecoService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Endereco> enderecoEncontrado = enderecoRepository.findById(id);
        if(enderecoEncontrado.isPresent()){
            enderecoRepository.save(entity);
        }

        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void delete(Integer id) {
        log.info("Acessando método delete");
        log.info("Valor recebido: {id}", id);

    }
}