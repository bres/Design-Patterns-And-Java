package designPatterns.Behavioral.Strategy.strategyEx1;

public class MallardDuck extends Duck{

    public MallardDuck() {
        fb=new FlyWithWings();
        qb=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }
}
