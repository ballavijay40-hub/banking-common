package com.banking.microservices.common.events.result;

import com.banking.microservices.common.enums.TransactionStatus;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionResultEvent {

    private String referenceNumber;

    private TransactionStatus status;

    private String  failureReason;


}
