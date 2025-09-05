package com.backenddeveloper.backend_financial_transaction.service;

import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationRequestDTOTransaction;
import com.backenddeveloper.backend_financial_transaction.model.AuthorizationTransaction;
import com.backenddeveloper.backend_financial_transaction.repository.AuthorizationTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorizationTransactionService {

    @Autowired
    private AuthorizationTransactionRepository repository;

    public void createAuthorization(AuthorizationRequestDTOTransaction authorizationRequestDTOTransaction){

        AuthorizationTransaction transaction = AuthorizationTransaction.builder()
                .transactionId(authorizationRequestDTOTransaction.transactionId())
                .installment(authorizationRequestDTOTransaction.installment())
                .card(authorizationRequestDTOTransaction.card())
                .paymentType(authorizationRequestDTOTransaction.paymentType())
                .currency(authorizationRequestDTOTransaction.currency())
                .amount(authorizationRequestDTOTransaction.amount())
                .build();

        repository.save(transaction);

    }

    public List<AuthorizationTransaction> listarTransacao(){
        List<AuthorizationTransaction> transacao = repository.findAll();
        return transacao;
    }

    public List<AuthorizationTransaction> listaTransacaoById(Long id) throws Exception {
        AuthorizationTransaction autorization = new AuthorizationTransaction();
        List<AuthorizationTransaction> transacao = repository.findAllById(Collections.singleton(id));
        transacao.stream().filter(t-> t.getId().equals(id)).collect(Collectors.toList());

        return transacao;


    }
}
