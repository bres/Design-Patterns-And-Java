package designPatterns.Behavioral.Strategy.strategyEx4;

public class ByCashPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(String amount) {
        System.out.println("The customer pays the amount :"+amount +"euro with cash");
    }
}
