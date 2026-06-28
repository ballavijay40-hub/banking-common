package com.banking.microservices.common.events.request;

import com.banking.microservices.common.enums.TransactionStatus;
import com.banking.microservices.common.enums.TransactionType;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionRequestEvent {

    private String referenceNumber;

    private Long fromAccountId;

    private Long toAccountId;

    private BigDecimal amount;

    private TransactionType transactionType;

    private TransactionStatus transactionStatus;
}
