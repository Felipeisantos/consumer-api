package br.com.workdb.model;

public class Clouds {
	public int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	public Clouds(int all) {
		super();
		this.all = all;
	}

	public Clouds() {
		super();
	}

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

}
