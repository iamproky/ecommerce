package com.example.ecommercegabriel.resource;


import com.example.ecommercegabriel.Interface.IResource;
import com.example.ecommercegabriel.model.Email;
import com.example.ecommercegabriel.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j //responsável pelo log da classe
@RestController //indica o uso de API
@RequestMapping(value = "api/v1/email")
public class EmailResource implements IResource<Email, Integer> {

    @Autowired //injeção de dependência
    private EmailService emailService;

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email create(@RequestBody Email entity) {
        log.info("Acessando método EmailResource.create");
        log.debug("EmailResource | valor recebido: {}", entity);
        return null;
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Email> read() {
        log.info("Acessando método EmailResource.read()");
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
    public Email read(@PathVariable("valor1") Integer id,
                      @PathVariable("valor2") Integer xpto) {
        return null;
    }*/

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email read(@PathVariable Integer id) {
        log.info("Acessando método EmailResource.get(id)");
        log.debug("Valor de pesquisa: {}", id);
        return null;
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email update(@PathVariable Integer id,
                        @RequestBody Email entity) {

        log.info("Acessando método EmailResource.update(id,entity)");
        log.debug("Valores recebidos: id - {}, entity: {}", id,entity);

        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        log.info("Acessando método EmailResource.delete");
        log.debug("Valor recebido: id - {}",id);

    }
}
