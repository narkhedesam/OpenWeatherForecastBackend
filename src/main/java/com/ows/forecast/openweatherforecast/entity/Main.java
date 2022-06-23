package com.ows.forecast.openweatherforecast.entity;

public class Main {
    private Double temp;
    private Double feelsLike;
    private Double tempMin;
    private Double tempMax;
    private Integer pressure;
    private Integer seaLevel;
    private Integer grndLevel;
    private Integer humidity;
    private Integer tempKf;
    public Double getTemp() {
        return temp;
    }
    public void setTemp(Double temp) {
        this.temp = temp;
    }
    public Double getFeelsLike() {
        return feelsLike;
    }
    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }
    public Double getTempMin() {
        return tempMin;
    }
    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }
    public Double getTempMax() {
        return tempMax;
    }
    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }
    public Integer getPressure() {
        return pressure;
    }
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }
    public Integer getSeaLevel() {
        return seaLevel;
    }
    public void setSeaLevel(Integer seaLevel) {
        this.seaLevel = seaLevel;
    }
    public Integer getGrndLevel() {
        return grndLevel;
    }
    public void setGrndLevel(Integer grndLevel) {
        this.grndLevel = grndLevel;
    }
    public Integer getHumidity() {
        return humidity;
    }
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
    public Integer getTempKf() {
        return tempKf;
    }
    public void setTempKf(Integer tempKf) {
        this.tempKf = tempKf;
    }
}