package designPatterns.Behavioral.Strategy.strategyEx4;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {


        System.out.println("Please enter the payment method:");
        System.out.println("credit card\ndebit card \ncash" );
        Scanner in = new Scanner(System.in);
        String paymentType=in.nextLine();
        System.out.println("payment type is "+paymentType);



        System.out.println("Please enter the amount that you want to pay");
        Scanner in2 = new Scanner(System.in);
        String amount = in2.nextLine();
        System.out.println("The amount that you want to pay is :"+amount +"euro");

        PaymentContext  ctx = null;
        ctx = new PaymentContext();

        if(paymentType.equalsIgnoreCase("credit card")) {
            ctx.setPaymentStrategy(new CreditCardPaymentStrategy());
        }else if (paymentType.equalsIgnoreCase("debit card")){
            ctx.setPaymentStrategy(new DebitCardPaymentStrategy());
        }else if (paymentType.equalsIgnoreCase("cash")) {
            ctx.setPaymentStrategy(new ByCashPaymentStrategy());
        }

        System.out.println("Payment context has as payment method:" +ctx.getPaymentStrategy());
        ctx.pay(amount);


    }
}
