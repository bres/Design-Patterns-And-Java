package designPatterns.Behavioral.Observer.observerEx1;

public interface IObservable {
    void add(IObserver o);
    void remove(IObserver o) ;
    void notifyDisplays();
}
