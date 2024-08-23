package designPatterns.Behavioral.Strategy.strategyEx4;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
    //Client will set payment startegy by calling this method-setter
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(String amount) {
        paymentStrategy.pay(amount);
    }
}
