package br.com.workdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distritos", schema = "public")
public class Distritos {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;

	@Column(name = "distritoId")
	public int distritoId;

	@Column(name = "distritoNome")
	public String distritoNome;

	@Column(name = "municipioId")
	public int municipioId;

	@Column(name = "municipioNome")
	public String municipioNome;

	@Column(name = "microrregiaoId")
	public int microrregiaoId;

	@Column(name = "microrregiaoNome")
	public String microrregiaoNome;

	@Column(name = "mesorregiaoId")
	public int mesorregiaoId;

	@Column(name = "mesorregiaoNome")
	public String mesorregiaoNome;

	@Column(name = "regiaoImediataId")
	public int regiaoImediataId;

	@Column(name = "regiaoImediataNome")
	public String regiaoImediataNome;

	@Column(name = "regiaoIntermediariaId")
	public int regiaoIntermediariaId;

	@Column(name = "regiaoIntermediariaNome")
	public String regiaoIntermediariaNome;

	@Column(name = "uFId")
	public int uFId;

	@Column(name = "uFSigla")
	public String uFSigla;

	@Column(name = "uFNome")
	public String uFNome;

	@Column(name = "regiaoId")
	public int regiaoId;

	@Column(name = "regiaoSigla")
	public String regiaoSigla;

	@Column(name = "regiaoNome")
	public String regiaoNome;


	public Distritos() {
		super();
	}

	public Distritos(int id, int distritoId, String distritoNome, int municipioId, String municipioNome,
			int microrregiaoId, String microrregiaoNome, int mesorregiaoId, String mesorregiaoNome,
			int regiaoImediataId, String regiaoImediataNome, int regiaoIntermediariaId, String regiaoIntermediariaNome,
			int uFId, String uFSigla, String uFNome, int regiaoId, String regiaoSigla, String regiaoNome) {
		super();
		this.id = id;
		this.distritoId = distritoId;
		this.distritoNome = distritoNome;
		this.municipioId = municipioId;
		this.municipioNome = municipioNome;
		this.microrregiaoId = microrregiaoId;
		this.microrregiaoNome = microrregiaoNome;
		this.mesorregiaoId = mesorregiaoId;
		this.mesorregiaoNome = mesorregiaoNome;
		this.regiaoImediataId = regiaoImediataId;
		this.regiaoImediataNome = regiaoImediataNome;
		this.regiaoIntermediariaId = regiaoIntermediariaId;
		this.regiaoIntermediariaNome = regiaoIntermediariaNome;
		this.uFId = uFId;
		this.uFSigla = uFSigla;
		this.uFNome = uFNome;
		this.regiaoId = regiaoId;
		this.regiaoSigla = regiaoSigla;
		this.regiaoNome = regiaoNome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDistritoId() {
		return distritoId;
	}

	public void setDistritoId(int distritoId) {
		this.distritoId = distritoId;
	}

	public String getDistritoNome() {
		return distritoNome;
	}

	public void setDistritoNome(String distritoNome) {
		this.distritoNome = distritoNome;
	}

	public int getMunicipioId() {
		return municipioId;
	}

	public void setMunicipioId(int municipioId) {
		this.municipioId = municipioId;
	}

	public String getMunicipioNome() {
		return municipioNome;
	}

	public void setMunicipioNome(String municipioNome) {
		this.municipioNome = municipioNome;
	}

	public int getMicrorregiaoId() {
		return microrregiaoId;
	}

	public void setMicrorregiaoId(int microrregiaoId) {
		this.microrregiaoId = microrregiaoId;
	}

	public String getMicrorregiaoNome() {
		return microrregiaoNome;
	}

	public void setMicrorregiaoNome(String microrregiaoNome) {
		this.microrregiaoNome = microrregiaoNome;
	}

	public int getMesorregiaoId() {
		return mesorregiaoId;
	}

	public void setMesorregiaoId(int mesorregiaoId) {
		this.mesorregiaoId = mesorregiaoId;
	}

	public String getMesorregiaoNome() {
		return mesorregiaoNome;
	}

	public void setMesorregiaoNome(String mesorregiaoNome) {
		this.mesorregiaoNome = mesorregiaoNome;
	}

	public int getRegiaoImediataId() {
		return regiaoImediataId;
	}

	public void setRegiaoImediataId(int regiaoImediataId) {
		this.regiaoImediataId = regiaoImediataId;
	}

	public String getRegiaoImediataNome() {
		return regiaoImediataNome;
	}

	public void setRegiaoImediataNome(String regiaoImediataNome) {
		this.regiaoImediataNome = regiaoImediataNome;
	}

	public int getRegiaoIntermediariaId() {
		return regiaoIntermediariaId;
	}

	public void setRegiaoIntermediariaId(int regiaoIntermediariaId) {
		this.regiaoIntermediariaId = regiaoIntermediariaId;
	}

	public String getRegiaoIntermediariaNome() {
		return regiaoIntermediariaNome;
	}

	public void setRegiaoIntermediariaNome(String regiaoIntermediariaNome) {
		this.regiaoIntermediariaNome = regiaoIntermediariaNome;
	}

	public int getuFId() {
		return uFId;
	}

	public void setuFId(int uFId) {
		this.uFId = uFId;
	}

	public String getuFSigla() {
		return uFSigla;
	}

	public void setuFSigla(String uFSigla) {
		this.uFSigla = uFSigla;
	}

	public String getuFNome() {
		return uFNome;
	}

	public void setuFNome(String uFNome) {
		this.uFNome = uFNome;
	}

	public int getRegiaoId() {
		return regiaoId;
	}

	public void setRegiaoId(int regiaoId) {
		this.regiaoId = regiaoId;
	}

	public String getRegiaoSigla() {
		return regiaoSigla;
	}

	public void setRegiaoSigla(String regiaoSigla) {
		this.regiaoSigla = regiaoSigla;
	}

	public String getRegiaoNome() {
		return regiaoNome;
	}

	public void setRegiaoNome(String regiaoNome) {
		this.regiaoNome = regiaoNome;
	}
	

	@Override
	public String toString() {
		return "Distritos [distritoId=" + distritoId + ", distritoNome=" + distritoNome + ", municipioId=" + municipioId
				+ ", municipioNome=" + municipioNome + ", microrregiaoId=" + microrregiaoId + ", microrregiaoNome="
				+ microrregiaoNome + ", mesorregiaoId=" + mesorregiaoId + ", mesorregiaoNome=" + mesorregiaoNome
				+ ", regiaoImediataId=" + regiaoImediataId + ", regiaoImediataNome=" + regiaoImediataNome
				+ ", regiaoIntermediariaId=" + regiaoIntermediariaId + ", regiaoIntermediariaNome="
				+ regiaoIntermediariaNome + ", uFId=" + uFId + ", uFSigla=" + uFSigla + ", uFNome=" + uFNome
				+ ", regiaoId=" + regiaoId + ", regiaoSigla=" + regiaoSigla + ", regiaoNome=" + regiaoNome + "]";
	}
}
