package models;

import java.text.MessageFormat;

public class Weather {
    private CurrentWeather currently;
    private String timezone;
    private HourlyWeather hourly;

    public CurrentWeather getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentWeather currently) {
        this.currently = currently;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return MessageFormat.format(
                "{0}\nTimezone: {1}\nTemperature: {2}\nPressure: {3}", getHourly(), getTimezone(), getCurrently().getTemperature(),  getCurrently().getPressure()
        );
    }

    public String getHourly() {
        return hourly.getSummary();
    }

    public void setHourly(HourlyWeather hourly) {
        this.hourly = hourly;
    }
}
