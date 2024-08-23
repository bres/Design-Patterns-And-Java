package designPatterns.Behavioral.Observer.observerEx2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    List<Observer> subs = new ArrayList<>();
    private String title;

    // add subscriber

    @Override
    public void subscribe(Observer sub) {
        subs.add(sub);
    }
    @Override
    public void unsubscribe(Observer sub) {
        subs.remove(sub);
    }
    //notify all--calls the update method on each subscriber
    @Override
    public void notifyAllSubscribes() {
        for(Observer sub :subs) {
            sub.update();
        }
    }
    //change the title and notify all
    @Override
    public void upload(String title) {
        this.title=title;
        notifyAllSubscribes();
    }

    public String getTitle() {
        return title;
    }
}
