package designPatterns.Behavioral.Visitor;

public class VisitorGuest implements  IVisitor{

    private String name;

    public VisitorGuest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Floor floor) {
        System.out.println(" My name is:"+name +" and i am a visitor guest that at this moment i am visiting the floor: "+floor.toString());

    }

    @Override
    public void visit(Elevator elevator) {
        System.out.println(" My name is:"+name +" and i am a visitor guest that at this moment i am visiting the elevator: "+elevator.toString());

    }
}
