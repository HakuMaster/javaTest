package observer;

/**
 * Created by liulang on 2017/9/5.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private  float humidity;
    private  Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature =temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humdity");
    }
}
