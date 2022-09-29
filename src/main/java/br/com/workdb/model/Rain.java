package br.com.workdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rain {
    @JsonProperty("1h")
    public double _1h;

}
