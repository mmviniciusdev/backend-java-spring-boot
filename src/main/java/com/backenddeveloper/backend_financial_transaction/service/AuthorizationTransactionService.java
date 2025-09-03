package com.backenddeveloper.backend_financial_transaction.service;

import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationRequestTransaction;
import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationResponseDTO;
import com.backenddeveloper.backend_financial_transaction.model.AuthorizationTransaction;
import com.backenddeveloper.backend_financial_transaction.repository.AuthorizationTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuthorizationTransactionService {

    @Autowired
    private AuthorizationTransactionRepository repository;

    public AuthorizationTransaction createAuthorization(AuthorizationRequestTransaction authorizationRequestTransaction){
        AuthorizationTransaction authorizationTransaction = AuthorizationTransaction.builder()
                .transactionId(authorizationRequestTransaction.getTransactionId())
                .amount(authorizationRequestTransaction.getAmount())
                .currency(authorizationRequestTransaction.getCurrency())
                .paymentType(authorizationRequestTransaction.getPaymentType())
                .installment(authorizationRequestTransaction.getInstallment())
                .card(authorizationRequestTransaction.getCard())
                .build();

        repository.save(authorizationTransaction);

        return authorizationTransaction;
    }
}
