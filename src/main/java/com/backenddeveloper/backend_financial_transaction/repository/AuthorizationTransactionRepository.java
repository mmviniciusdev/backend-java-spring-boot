package com.backenddeveloper.backend_financial_transaction.repository;

import com.backenddeveloper.backend_financial_transaction.model.AuthorizationTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorizationTransactionRepository extends JpaRepository<AuthorizationTransaction, Long> {

}
