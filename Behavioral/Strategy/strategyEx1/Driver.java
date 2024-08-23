package designPatterns.Behavioral.Strategy.strategyEx1;

public class Driver {

    public static void main(String[] args) {

        Duck mduck = new MallardDuck();
        mduck.display();
        mduck.performFly();
        mduck.performQuack();


        Duck rduck = new RubberDuck();
        rduck.display();
        rduck.performFly();
        rduck.performQuack();
    }
}
