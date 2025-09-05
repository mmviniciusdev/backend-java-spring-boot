package com.backenddeveloper.backend_financial_transaction.model;

import jakarta.persistence.Entity;

public enum Type {

    CASH,
    ACQR_INSTALLMENT,
    ISSR_INSTALL_WITH_INT,
    ISST_INSTALL_WITHOUT_INT
}
