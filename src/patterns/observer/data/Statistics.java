package patterns.observer.data;

public class Statistics {

    private float[] temperatureStatistics = new float[3];
    private float[] pressureStatistics = new float[3];
    private float[] humidityStatistics = new float [3];

    public void putMeasurement (Measurement measurement) {

        putMeasure (measurement.getTemperature(), temperatureStatistics);
        putMeasure (measurement.getPressure(), pressureStatistics);
        putMeasure (measurement.getHumidity(), humidityStatistics);
    }
    public void putMeasure (int current, float[] stat) {

        if (stat[0] == 0.0f &&
                stat[1] == 0.0f &&
                stat[2] == 0.0f) {

            stat[0] = stat[1] = stat[2] = current;
        }

        if (current < stat[0]) {
            stat[0] = current;
        }

        if (current > stat[2]) {
            stat[2] = current;
        }

        stat[1] = (stat[1] + current) / 2.0f;
    }

    @Override
    public String toString () {

        return "\nTemperature:" +
                "\nMin: " + temperatureStatistics[0] +
                "\nAvg: " + temperatureStatistics[1] +
                "\nMax: " + temperatureStatistics[2] +
                "\nPressure:" +
                "\nMin: " + pressureStatistics[0] +
                "\nAvg: " + pressureStatistics[1] +
                "\nMax: " + pressureStatistics[2] +
                "\nHumidity:" +
                "\nMin: " + humidityStatistics[0] +
                "\nAvg: " + humidityStatistics[1] +
                "\nMax: " + humidityStatistics[2];
    }
}
