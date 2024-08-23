package designPatterns.Behavioral.Visitor;

public class Floor implements IElement{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
