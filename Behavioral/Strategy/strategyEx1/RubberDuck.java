package designPatterns.Behavioral.Strategy.strategyEx1;

public class RubberDuck extends Duck{

    public RubberDuck() {
        fb=new FlyNoWay();
        qb=new Squeak();
    }
    @Override
    public void display() {
        System.out.println("i am a rubber duck");
    }
}
