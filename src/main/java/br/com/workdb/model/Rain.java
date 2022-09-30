package br.com.workdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    @JsonProperty("3h")
    public double _3h;

    public Rain() {
    }

    public Rain(double _3h) {
        this._3h = _3h;
    }

    public double get_3h() {
        return _3h;
    }

    public void set_3h(double _3h) {
        this._3h = _3h;
    }
}
