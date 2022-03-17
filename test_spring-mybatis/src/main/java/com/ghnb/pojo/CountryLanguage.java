package com.ghnb.pojo;

import lombok.Data;

import java.util.List;

@Data
public class CountryLanguage {
    private List<City> cities;
    private String Language;
    private boolean isOfficial;
    private float Percentage;
}
