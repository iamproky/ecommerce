package com.example.ecommercegabriel.service;


import com.example.ecommercegabriel.Interface.IService;
import com.example.ecommercegabriel.model.Email;
import com.example.ecommercegabriel.repository.EmailRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class EmailService implements IService<Email, Integer> {
    @Autowired //injeção de dependência
    private EmailRepository emailRepository;


    @Override
    @Transactional
    public Email create(Email entity) {
        log.info("Acessando método EmailService.create");
        log.debug("Valores recebidos: {}", entity);

        return emailRepository.save(entity);
    }

    @Override
    public List<Email> read() {
        log.info("Acessando método EmailResource.read()");

        List<Email> lista = emailRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Email read(Integer id) {
        log.info("Acessando método PessoaResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Email emailEncontrado = emailRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public Email update(Integer id, Email entity) {
        log.info("Acessando método EmailService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Email> emailEncontrado = emailRepository.findById(id);
        if(emailEncontrado.isPresent()){
            emailRepository.save(entity);
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