package designPatterns.Behavioral.Strategy.strategyEx1;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
