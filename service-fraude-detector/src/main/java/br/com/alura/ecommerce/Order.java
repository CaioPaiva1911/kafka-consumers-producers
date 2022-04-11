package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {
    private final String orderId;
      private final BigDecimal amount;
      private final String email;

    public Order(String email, String orderId, BigDecimal amount) {
        this.email = email;
        this.orderId = orderId;
        this.amount = amount;
    }

    public BigDecimal getAmount(){ return amount; }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId='" + email + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
