package com.backenddeveloper.backend_financial_transaction.dto;


import com.backenddeveloper.backend_financial_transaction.model.PaymentType;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthorizationResponseDTO {

    private String transactionId;
    private int amount;
    private String currency;
    private PaymentType paymentType;
    private AuthorizationPOSRequestDTOInstalment installment;
    private AuthorizationPOSRequestDTOCard card;
    private LocalDateTime timeStamp;
}
