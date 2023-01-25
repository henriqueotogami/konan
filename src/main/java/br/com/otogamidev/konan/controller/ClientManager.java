package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * URL -> http://localhost:8080/clients
 */
@RestController
@RequestMapping(path="/clients")
public class ClientManager {

    /**
     * URL -> http://localhost:8080/clients/whatever
     * @return Retorna um cliente qualquer.
     */
    @GetMapping(path="/whatever")
    public Client getClient() {
        return new Client(28, "Pedro", "123.456.789-00");
    }

    /**
     * URL -> http://localhost:8080/clients/2
     * @param id Identificador único do cliente.
     * @return Retorna um cliente quando o ID é requisitado no endereço da URL.
     */
    @GetMapping("/{id}")
    public Client getClientByIdInPath(@PathVariable final int id) {
        return new Client(id, "Maria", "987.654.321-00");
    }

    /**
     * URL -> http://localhost:8080/clients?id=2
     * @param id Identificador único do cliente.
     * @return Retorna um cliente quando o ID é requisitado como parâmetro da URL.
     */
    @GetMapping
    public Client getClientByIdInRequest(@RequestParam(name="id", defaultValue="0") final int id) {
        return new Client(id, "João Augusto", "111.222.333-44");
    }

}
