package org.example.facade;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentServiceF paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentServiceF();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String product, double amount) {
        inventoryService.checkInventory(product);
        paymentService.processPayment(amount);
        shippingService.shipOrder(product);
        System.out.println("Pedido concluído com sucesso para o produto: " + product);
    }
}
