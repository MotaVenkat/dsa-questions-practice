package org.example;

public class Operations {

    int a ;
    int b;
    public boolean transferAmount(Account sender, Account receiver, double amount) {
        if (sender.getBalence() >= amount) {
            sender.setBalence(sender.getBalence() - amount);
            receiver.setBalence(receiver.getBalence() + amount);
            System.out.println("✅ Transaction successful! Transferred " + amount + " from "
                    + sender.getAccno() + " to " + receiver.getAccno());
            return true;
        } else {
            System.out.println("❌ Transaction failed: Insufficient balance in sender account.");
            return false;
        }
    }

}
