
public class CurrentConditionsDisplay implements Display, Observer {
	float temp;
	float humidity;
	float pressure;
	Subject weatherData;
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("Current Conditions: " + temp + "F degrees and " + humidity + "% humidity");
	}
	
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();	
	}
}
