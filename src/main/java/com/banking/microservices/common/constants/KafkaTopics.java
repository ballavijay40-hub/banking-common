package com.banking.microservices.common.constants;

public  final  class   KafkaTopics {
    private KafkaTopics() {

    }

    // Constants
    public static final String TRANSACTION_REQUESTS = "transaction-requests";
    public static final String TRANSACTION_RESULTS = "transaction-results";

    public  static final String LOAN_APPROVED_REQUEST="loan_approved_requests";

    public static final String USER_REGISTER_REQUEST= "user-registered";

}
