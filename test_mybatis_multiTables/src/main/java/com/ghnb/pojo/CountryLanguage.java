package com.ghnb.pojo;

import lombok.Data;

import java.util.List;


public class CountryLanguage {
    private List<City> cities;
    private String Language;
    private boolean isOfficial;
    private float Percentage;


    public CountryLanguage() {
    }


    public CountryLanguage(List<City> cities, String language, boolean isOfficial, float percentage) {
        this.cities = cities;
        Language = language;
        this.isOfficial = isOfficial;
        Percentage = percentage;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float percentage) {
        Percentage = percentage;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "cities=" + cities +
                ", Language='" + Language + '\'' +
                ", isOfficial=" + isOfficial +
                ", Percentage=" + Percentage +
                '}';
    }
}
