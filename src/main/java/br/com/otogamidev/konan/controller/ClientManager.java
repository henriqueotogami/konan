package br.com.otogamidev.konan.controller;

import br.com.otogamidev.konan.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/clients")
public class ClientManager {

    @GetMapping(path="/whatever")
    public Client getClient() {
        return new Client(28, "Pedro", "123.456.789-00");
    }

}
