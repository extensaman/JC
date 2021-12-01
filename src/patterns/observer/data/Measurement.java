package patterns.observer.data;

public class Measurement {

    private int temperature;
    private int pressure;
    private int humidity;

    public Measurement () {
    }

    public Measurement (int temperature, int pressure, int humidity) {
        setTemperature(temperature);
        setPressure(pressure);
        setHumidity(humidity);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {

        if (pressure < 0) {

            pressure = 0;
        }

        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {

        if (humidity > 100) {

            humidity= 100;

        } else if (humidity < 0) {

            humidity = 0;
        }

        this.humidity = humidity;
    }

    @Override
    public String toString () {
        return "\nTempearature: " + temperature + "\nPressure: " +
                pressure + "\nHumidity: " + humidity;
    }
}
