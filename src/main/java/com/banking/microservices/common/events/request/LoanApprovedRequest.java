package com.banking.microservices.common.events.request;

import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanApprovedRequest {

    private String loanId;

    private String customerId;

    private String accountNumber;

    private BigDecimal loanAmount;
}
