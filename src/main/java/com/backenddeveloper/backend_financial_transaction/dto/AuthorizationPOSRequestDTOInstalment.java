package com.backenddeveloper.backend_financial_transaction.dto;

import com.backenddeveloper.backend_financial_transaction.model.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizationPOSRequestDTOInstalment {

    private int count;
    private Type type;
}
