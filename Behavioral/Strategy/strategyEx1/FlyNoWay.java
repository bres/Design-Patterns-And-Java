package designPatterns.Behavioral.Strategy.strategyEx1;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println(" i can not fly");
    }
}
