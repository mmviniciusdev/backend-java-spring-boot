package com.backenddeveloper.backend_financial_transaction.dto;

import com.backenddeveloper.backend_financial_transaction.model.CreditCard;
import com.backenddeveloper.backend_financial_transaction.model.Installment;
import com.backenddeveloper.backend_financial_transaction.model.PaymentType;
import lombok.*;


public record AuthorizationRequestDTOTransaction(
        String transactionId,
        int amount,
        String currency,
        PaymentType paymentType,
        Installment installment,
        CreditCard card

) {


}
