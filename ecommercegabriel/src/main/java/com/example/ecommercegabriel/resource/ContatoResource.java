package com.example.ecommercegabriel.resource;


import com.example.ecommercegabriel.Interface.IResource;
import com.example.ecommercegabriel.model.Contato;
import com.example.ecommercegabriel.service.ContatoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //responsável pelo log da classe
@RestController //indica o uso de API
@RequestMapping(value = "api/v1/contato")
public class ContatoResource implements IResource<Contato, Integer> {

    @Autowired //injeção de dependência
    private ContatoService contatoService;

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Contato create(@RequestBody Contato entity) {
        log.info("Acessando método ContatoResource.create");
        log.debug("ContatoResource | valor recebido: {}", entity);
        return null;
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Contato> read() {
        log.info("Acessando método ContatoResource.read()");
        log.debug("A consulta retornou {} registros", 0);

        return null;
    }

    /**
     * @GetMapping("/{id}") => @PathVariable
     * GET http://localhost:8081/api/v1/pessoa/{id}
     * @param id
     * @return
     */
    @GetMapping(
            name = "/{valor1}/{valor2}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    /*@Override
    public Contato read(@PathVariable("valor1") Integer id,
                      @PathVariable("valor2") Integer xpto) {
        return null;
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )*/
    @Override
    public Contato read(@PathVariable Integer id) {
        log.info("Acessando método ContatoResource.get(id)");
        log.debug("Valor de pesquisa: {}", id);
        return null;
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Contato update(@PathVariable Integer id,
                        @RequestBody Contato entity) {

        log.info("Acessando método ContatoResource.update(id,entity)");
        log.debug("Valores recebidos: id - {}, entity: {}", id,entity);

        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        log.info("Acessando método ContatoResource.delete");
        log.debug("Valor recebido: id - {}",id);

    }
}
