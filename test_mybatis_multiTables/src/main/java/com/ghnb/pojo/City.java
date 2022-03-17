package com.ghnb.pojo;

import lombok.Data;


public class City {
    private int ID;
    private String Name;
    private CountryLanguage countryLanguage;
    private String District;
    private int Population;

    public City() {
    }

    public City(int ID, String name, CountryLanguage countryLanguage, String district, int population) {
        this.ID = ID;
        Name = name;
        this.countryLanguage = countryLanguage;
        District = district;
        Population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public CountryLanguage getCountryLanguage() {
        return countryLanguage;
    }

    public void setCountryLanguage(CountryLanguage countryLanguage) {
        this.countryLanguage = countryLanguage;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", countryLanguage=" + countryLanguage +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }


}
