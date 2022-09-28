package br.com.workdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continente", schema = "public")
public class Continente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "lng")
	public String lng;

	@Column(name = "geonameid")
	public Integer geonameId;

	@Column(name = "name")
	public String name;

	@Column(name = "fclname")
	public String fclName;

	@Column(name = "toponymname")
	public String toponymName;

	@Column(name = "fcodename")
	public String fcodeName;

	@Column(name = "adminname1")
	public String adminName1;

	@Column(name = "lat")
	public String lat;

	@Column(name = "fcl")
	public String fcl;

	@Column(name = "fcode")
	public String fcode;

	@Column(name = "population")
	public Integer population;
}