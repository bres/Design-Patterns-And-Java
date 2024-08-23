package designPatterns.Behavioral.Strategy.strategyEx1;

public abstract class Duck {
    FlyBehavior fb;
    QuackBehavior qb;

    public void swim() {
        System.out.println("all ducks can swim");
    }

    public abstract void display(); // to be override

    public void performFly() {
        fb.fly();
    }

    public void performQuack() {
        qb.quack();
    }
}
