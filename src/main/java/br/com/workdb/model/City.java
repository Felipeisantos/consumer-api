package br.com.workdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "city", schema = "public")
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome")
	private String name;

	@JoinColumn(name = "country")
	private Integer countryId;

	public City(String name, Integer countryId) {
		super();
		this.name = name;
		this.countryId = countryId;
	}
	
	
}
