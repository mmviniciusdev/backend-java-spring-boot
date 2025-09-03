package com.backenddeveloper.backend_financial_transaction.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Installment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private int count;
    private Type type;

}
