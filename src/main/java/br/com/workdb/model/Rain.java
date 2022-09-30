package br.com.workdb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
	@JsonProperty("1h")
	public double _1h;

	public Rain() {
		super();
	}

	public Rain(double _1h) {
		super();
		this._1h = _1h;
	}

	public double get_1h() {
		return _1h;
	}

	public void set_1h(double _1h) {
		this._1h = _1h;
	}

	@Override
	public String toString() {
		return "Rain [_1h=" + _1h + "]";
	}

}
