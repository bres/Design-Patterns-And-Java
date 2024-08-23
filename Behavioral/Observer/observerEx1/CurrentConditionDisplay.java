package designPatterns.Behavioral.Observer.observerEx1;

public class CurrentConditionDisplay implements  IObserver,DisplayElement{
    private  WeatherStation station;
    private float temp,humidity;


    public CurrentConditionDisplay(WeatherStation station) {
        this.station=station;
        station.add(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:"+
                temp +"F degrees," +
                humidity + "% humidity");
    }
}
