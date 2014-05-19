import java.util.ArrayList;


public class WeatherData implements Subject {
	private ArrayList<Observer> observer;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observer = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observer.indexOf(o);
		if(index >= 0) observer.remove(index);

	}

	@Override
	public void notifyObservers() {
		for(int i = 0; i < observer.size(); i++) {
			Observer o = observer.get(i);
			o.update(temp, humidity, pressure);
		}

	}
	
	public void measurementsChanged() {
		notifyObservers();
	} 
	
	public void setMesurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
