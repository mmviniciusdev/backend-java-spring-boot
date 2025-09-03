package com.backenddeveloper.backend_financial_transaction.dto;

import com.backenddeveloper.backend_financial_transaction.model.PaymentType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorizationRequestTransaction {

    private String transactionId;
    private int amount;
    private String currency;
    private PaymentType paymentType;
    private String installment;
    private String card;
}
