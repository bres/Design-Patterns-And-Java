package designPatterns.Behavioral.Visitor;

public class VisitorEmployee implements IVisitor{
    private String name;

    public VisitorEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Floor floor) {
        System.out.println(" My name is:"+name +" and i am a visitor employee that at this moment i am visiting the floor :"+floor.toString());

    }

    @Override
    public void visit(Elevator elevator) {
        System.out.println(" My name is:"+name +" and i am a visitor employee that at this moment i am visiting the elevator :"+elevator.toString());

    }
}
