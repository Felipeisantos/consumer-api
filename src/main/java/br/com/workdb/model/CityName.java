package br.com.workdb.model;

import lombok.Data;

@Data
public class CityName {
    public String name;
    public LocalNames local_names;
    public double lat;
    public double lon;
    public String country;
    public String state;

}
