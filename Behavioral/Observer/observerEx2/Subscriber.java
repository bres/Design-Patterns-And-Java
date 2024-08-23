package designPatterns.Behavioral.Observer.observerEx2;


public class Subscriber implements Observer {
    private String name;
    private Channel channel= new Channel();

    @Override
    public void update() {
        System.out.println("Hey dear "+name +", the video \'" +channel.getTitle() + "\' has been uploaded!");
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void subscribeChannel(Channel ch) {
        channel=ch;
    }

}
