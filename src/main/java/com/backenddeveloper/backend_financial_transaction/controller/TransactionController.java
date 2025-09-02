package com.backenddeveloper.backend_financial_transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-transaction")
public class TransactionController {

    @GetMapping
    public String HelloAPI(){
        return "Desenvolvimento de Microservicos de transacoes financeiras e agenda de liquidacao";
    }
}
