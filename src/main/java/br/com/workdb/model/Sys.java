package br.com.workdb.model;


import lombok.Data;

@Data
public class Sys {
    public int type;
    public int id;
    public String country;
    public int sunrise;
    public int sunset;
}
