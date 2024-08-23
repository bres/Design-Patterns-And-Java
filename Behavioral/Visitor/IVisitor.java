package designPatterns.Behavioral.Visitor;

public interface IVisitor {

    void visit(Floor floor);
    void visit(Elevator elevator);
}
