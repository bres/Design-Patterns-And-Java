package designPatterns.Behavioral.Visitor;

public interface IElement {
    void accept(IVisitor visitor);
}
