package com.example.ecommercegabriel.resource;


import com.example.ecommercegabriel.Interface.IResource;
import com.example.ecommercegabriel.model.PessoaFisica;
import com.example.ecommercegabriel.service.PessoaFisicaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //responsável pelo log da classe
@RestController //indica o uso de API
@RequestMapping(value = "api/v1/pessoafisica")
public class PessoaFisicaResource implements IResource<PessoaFisica, Integer> {

    @Autowired //injeção de dependência
    private PessoaFisicaService pessoaFisicaService;

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica create(@RequestBody PessoaFisica entity) {
        log.info("Acessando método PessoaFisicaResource.create");
        log.debug("PessoaFisicaResource | valor recebido: {}", entity);
        return null;
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<PessoaFisica> read() {
        log.info("Acessando método PessoaFisicaResource.read()");
        log.debug("A consulta retornou {} registros", 0);

        return null;
    }

    /**
     * @GetMapping("/{id}") => @PathVariable
     * GET http://localhost:8081/api/v1/pessoa/{id}
     * @param id
     * @return
     */
    /*@GetMapping(
            name = "/{valor1}/{valor2}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica read(@PathVariable("valor1") Integer id,
                      @PathVariable("valor2") Integer xpto) {
        return null;
    }*/

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica read(@PathVariable Integer id) {
        log.info("Acessando método PessoaFisicaResource.get(id)");
        log.debug("Valor de pesquisa: {}", id);
        return null;
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public PessoaFisica update(@PathVariable Integer id,
                        @RequestBody PessoaFisica entity) {

        log.info("Acessando método PessoaFisicaResource.update(id,entity)");
        log.debug("Valores recebidos: id - {}, entity: {}", id,entity);

        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        log.info("Acessando método PessoaFisicaResource.delete");
        log.debug("Valor recebido: id - {}",id);

    }
}
