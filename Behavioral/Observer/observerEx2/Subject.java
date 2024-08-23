package designPatterns.Behavioral.Observer.observerEx2;

public interface Subject {
    // add subscriber
    void subscribe(Observer sub);

    // remove subscriber
    void unsubscribe(Observer sub);

    //notify all--calls the update method on each subscriber
    void notifyAllSubscribes();

    //change the title and notify all
    void upload(String title);
}
