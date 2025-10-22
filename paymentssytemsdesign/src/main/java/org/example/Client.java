package org.example;

public class Client {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccno(500);
        account1.setAcc_status("positive");
        account1.setBalence(23456.00);

        Account account2 = new Account();
        account2.setAccno(6789);
        account2.setAcc_status("positive");
        account2.setBalence(250);



        User user1 = new User("venkat","1","v@gmail.com",account1);
        User user2 = new User("chandra","2","c@gmail.com",account2);
        Operations operations= new Operations();
        operations.transferAmount(account1,account2,500);

        Transaction transaction= new Transaction();
        transaction.setTransaction_Id(1);
        transaction.setTransaction_Amnt(500);
        transaction.setTime_Stamp("19-10-2025");
        transaction.setTransactionStatusEnum(TransactionStatusEnum.transaction_success);
        transaction.setOperations(operations);
        System.out.println("Sender Balance: " + user1.getAccount().getBalence());
        System.out.println("Receiver Balance: " + user2.getAccount().getBalence());



    }
}
