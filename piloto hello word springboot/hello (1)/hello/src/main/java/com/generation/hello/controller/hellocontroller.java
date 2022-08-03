package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation - Anotação Spring
@RestController // indica para o Spring que o código abaixo é da classe controladora
@RequestMapping("/hello")//Endpoint -- /alguma coisa.. indica meu endpoint

public class hellocontroller {

    @GetMapping //a função que vai executar
    //função de hello - dentro dos parenteses são os parametros da função e dentro das chaves oque a função retorna
    public String hello() {
        return "Hello World!!!";
    }

}
