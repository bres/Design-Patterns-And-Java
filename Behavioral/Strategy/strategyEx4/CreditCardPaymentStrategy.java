package designPatterns.Behavioral.Strategy.strategyEx4;

public class CreditCardPaymentStrategy implements  PaymentStrategy{
    @Override
    public void pay(String amount) {
        System.out.println("Customer pays the amount of :" +amount +"euro with Credit card");
    }
}
