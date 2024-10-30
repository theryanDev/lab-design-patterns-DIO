package org.example;

import org.example.facade.OrderFacade;
import org.example.singleton.DatabaseConnection;
import org.example.strategy.CreditCardPayment;
import org.example.strategy.PaymentService;
import org.example.strategy.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Singleton
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        // Exemplo de Strategy
        System.out.println();
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.processPayment(150.0);

        paymentService.setPaymentStrategy(new PaypalPayment());
        paymentService.processPayment(250.0);

        // Exemplo de Facade
        OrderFacade orderFacade = new OrderFacade();
        System.out.println();
        orderFacade.placeOrder("Notebook", 3000.0);
    }
}