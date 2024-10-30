package org.example.strategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
            this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("Estratégia de pagamento não definida.");
            return;
        }
        strategy.pay(amount);
    }
}