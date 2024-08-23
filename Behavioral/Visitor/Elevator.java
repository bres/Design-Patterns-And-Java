package designPatterns.Behavioral.Visitor;

public class Elevator implements IElement{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
