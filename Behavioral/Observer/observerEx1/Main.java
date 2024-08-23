package designPatterns.Behavioral.Observer.observerEx1;

public class Main {

    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        CurrentConditionDisplay ccDisplay = new CurrentConditionDisplay(ws);

        ws.setMeasurements(33,24,12);

        ws.setMeasurements(36,21,12);

    }
}
