package com.backenddeveloper.backend_financial_transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-transaction")
public class TransactionController {

    @GetMapping
    public String HelloAPI(){

        String json = "{\n" +
                "  \"nome\": \"Marcus Vinicius F R Castro\",\n" +
                "  \"idade\": 37,\n" +
                "  \"isEstudante\": true,\n" +
                "  \"cursos\": [\"Programação\", \"Desenvolvimento\", \"Análise de Dados\"],\n" +
                "  \"endereco\": {\n" +
                "    \"rua\": \"Rua José Pinto de Almeida\",\n" +
                "    \"numero\": 801,\n" +
                "    \"cidade\": \"Piracicaba\"\n" +
                "  }\n" +
                "}";
        return "Desenvolvimento de Microservicos de transacoes financeiras e agenda de liquidacao\n " + json;
    }
}
