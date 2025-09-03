package com.backenddeveloper.backend_financial_transaction.model;


import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationPOSRequestDTOCard;
import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationPOSRequestDTOInstalment;
import jakarta.persistence.*;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class AuthorizationTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transactionId;
    private int amount;
    private String currency;
    private PaymentType paymentType;
    private String installment;
    private String card;
}
