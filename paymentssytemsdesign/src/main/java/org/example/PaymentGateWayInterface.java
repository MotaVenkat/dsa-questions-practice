package org.example;

public interface PaymentGateWayInterface {
    void processPayment(User sender, User receiver, double amount);
}
