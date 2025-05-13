package playmaker.webbservicelabb3.entity;


public class WeatherData {

    String origin;
    String time;
    double temp;
    double humidity;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }



    public void setHumidity(double humidity) {
        this.humidity = humidity;

    }
    @Override
    public String toString() {
        return "WeatherData{" +
                "origin='" + origin + '\'' +
                ", time='" + time + '\'' +
                ", temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
