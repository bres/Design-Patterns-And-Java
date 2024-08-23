package designPatterns.Behavioral.Observer.observerEx2;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
