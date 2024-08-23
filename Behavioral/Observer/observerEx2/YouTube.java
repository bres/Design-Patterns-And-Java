package designPatterns.Behavioral.Observer.observerEx2;

public class YouTube {

    public static void main(String[] args) {
        //creating the channel george
        Channel george = new Channel();

        //creating the subscribers
        Observer s1 = new Subscriber("maria");
        Observer s2 = new Subscriber("anna");
        Observer s3 = new Subscriber("giannhs");
        Observer s4 = new Subscriber("takis");
        Observer s5 = new Subscriber("lina");

        // add subscribers to the channel george
        // channel know the subscribers
        george.subscribe(s1);
        george.subscribe(s2);
        george.subscribe(s3);
        george.subscribe(s4);
        george.subscribe(s5);

        //unsubscribe
        george.unsubscribe(s3);

        //each subscriber must know which channel subscribes
        //subscribers know the channel
        s1.subscribeChannel(george);
        s2.subscribeChannel(george);
        s3.subscribeChannel(george);
        s4.subscribeChannel(george);
        s5.subscribeChannel(george);

        //upload a new video
        george.upload("learn design patterns");

    }
}
