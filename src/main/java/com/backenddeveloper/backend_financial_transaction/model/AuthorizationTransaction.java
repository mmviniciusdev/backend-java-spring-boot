package com.backenddeveloper.backend_financial_transaction.model;


import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationPOSRequestDTOCard;
import com.backenddeveloper.backend_financial_transaction.dto.AuthorizationPOSRequestDTOInstalment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import lombok.*;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "transactions")
@Table(name = "transactions")
public class AuthorizationTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private String transactionId;
    private int amount;
    private String currency;
    private PaymentType paymentType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "installment_id")
    private Installment installment;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "creditCard_id")
    private CreditCard card;
}
