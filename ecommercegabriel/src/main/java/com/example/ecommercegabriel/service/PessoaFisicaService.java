package com.example.ecommercegabriel.service;


import com.example.ecommercegabriel.Interface.IService;
import com.example.ecommercegabriel.model.PessoaFisica;
import com.example.ecommercegabriel.repository.PessoaFisicaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class PessoaFisicaService implements IService<PessoaFisica, Integer> {
    @Autowired //injeção de dependência
    private PessoaFisicaRepository pessoaFisicaRepository;


    @Override
    @Transactional
    public PessoaFisica create(PessoaFisica entity) {
        log.info("Acessando método PessoaFisicaService.create");
        log.debug("Valores recebidos: {}", entity);

        return pessoaFisicaRepository.save(entity);
    }

    @Override
    public List<PessoaFisica> read() {
        log.info("Acessando método PessoaFisicaResource.read()");

        List<PessoaFisica> lista = pessoaFisicaRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public PessoaFisica read(Integer id) {
        log.info("Acessando método PessoaFisicaResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //PessoaFisica pessoaFisicaEncontrado = pessoaFisicaRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public PessoaFisica update(Integer id, PessoaFisica entity) {
        log.info("Acessando método PessoaFisicaService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<PessoaFisica> pessoaFisicaEncontrado = pessoaFisicaRepository.findById(id);
        if(pessoaFisicaEncontrado.isPresent()){
            pessoaFisicaRepository.save(entity);
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