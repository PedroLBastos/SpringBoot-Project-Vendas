package com.pedro.study.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/clientes")
public class ClienteController {

        @GetMapping("/hello/{nome}")
        @ResponseBody
        public String helloCliente(@PathVariable("nome") String nomeCliente){
            return String.format("Hello %s", nomeCliente);
        }
}
