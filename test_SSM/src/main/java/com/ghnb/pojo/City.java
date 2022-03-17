package com.ghnb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;
}
