package org.example;

public class Transaction {
    private int transaction_Id;
    private int transaction_Amnt;
    private String time_Stamp;

    private TransactionStatusEnum transactionStatusEnum;

    private Operations operations;

    public TransactionStatusEnum getTransactionStatusEnum() {
        return transactionStatusEnum;
    }

    public void setTransactionStatusEnum(TransactionStatusEnum transactionStatusEnum) {
        this.transactionStatusEnum = transactionStatusEnum;
    }



    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    public int getTransaction_Id() {
        return transaction_Id;
    }

    public void setTransaction_Id(int transaction_Id) {
        this.transaction_Id = transaction_Id;
    }

    public int getTransaction_Amnt() {
        return transaction_Amnt;
    }

    public void setTransaction_Amnt(int transaction_Amnt) {
        this.transaction_Amnt = transaction_Amnt;
    }

    public String getTime_Stamp() {
        return time_Stamp;
    }

    public void setTime_Stamp(String time_Stamp) {
        this.time_Stamp = time_Stamp;
    }
}
