package com.example.ecommercegabriel.service;


import com.example.ecommercegabriel.Interface.IService;
import com.example.ecommercegabriel.model.PessoaJuridica;
import com.example.ecommercegabriel.repository.PessoaJuridicaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class PessoaJuridicaService implements IService<PessoaJuridica, Integer> {
    @Autowired //injeção de dependência
    private PessoaJuridicaRepository pessoaJuridicaRepository;


    @Override
    @Transactional
    public PessoaJuridica create(PessoaJuridica entity) {
        log.info("Acessando método PessoaJuridicaService.create");
        log.debug("Valores recebidos: {}", entity);

        return pessoaJuridicaRepository.save(entity);
    }

    @Override
    public List<PessoaJuridica> read() {
        log.info("Acessando método PessoaJuridicaResource.read()");

        List<PessoaJuridica> lista = pessoaJuridicaRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public PessoaJuridica read(Integer id) {
        log.info("Acessando método PessoaJuridicaResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //PessoaJuridica pessoaJuridicaEncontrado = pessoaJuridicaRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public PessoaJuridica update(Integer id, PessoaJuridica entity) {
        log.info("Acessando método PessoaJuridicaService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<PessoaJuridica> pessoaJuridicaEncontrado = pessoaJuridicaRepository.findById(id);
        if(pessoaJuridicaEncontrado.isPresent()){
            pessoaJuridicaRepository.save(entity);
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