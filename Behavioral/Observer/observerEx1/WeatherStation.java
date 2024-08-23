package designPatterns.Behavioral.Observer.observerEx1;

import java.util.ArrayList;

public class WeatherStation implements IObservable{
    private ArrayList<IObserver> observers;
    private float temp,pressure,humidity;

    //constructor
    public WeatherStation() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void add(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void remove(IObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyDisplays() {
        for(IObserver o :this.observers) {
            o.update(temp,humidity,pressure); // the hurt of observer pattern
        }
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void measurementsChanges(){
        notifyDisplays();
    }

    //hard code for testing
    public void setMeasurements(float temp,float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanges();
    }
}
