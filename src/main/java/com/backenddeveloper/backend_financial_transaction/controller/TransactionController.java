package com.backenddeveloper.backend_financial_transaction.controller;

import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationRequestDTOTransaction;
import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationResponseDTO;
import com.backenddeveloper.backend_financial_transaction.model.AuthorizationTransaction;
import com.backenddeveloper.backend_financial_transaction.service.AuthorizationTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ms-transaction")
public class TransactionController {

    @Autowired
    private AuthorizationTransactionService service;

    @GetMapping
    public String HelloAPI() {

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAuthorization(@RequestBody AuthorizationRequestDTOTransaction authorizationRequestDTOTransaction){
        service.createAuthorization(authorizationRequestDTOTransaction);
    }

    @GetMapping("/listar-transacao")
    @ResponseStatus(HttpStatus.OK)
    public List<AuthorizationTransaction> listarTransacao(){
        return service.listarTransacao();
    }

    @GetMapping("/{id}")
    public List<AuthorizationTransaction> listarTransacaoById(@PathVariable ("id") Long id) throws Exception {
        return service.listaTransacaoById(id);
    }
}
