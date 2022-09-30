package br.com.workdb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.context.annotation.ScopeMetadata;

@Entity
@Table(name = "consult_history")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class ConsultHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "date_consult")
    private Date dateConsult;


    @Type(type = "jsonb")
    @Column(columnDefinition = "json")
    private WeatherForecast json;

    public ConsultHistory() {
        super();
    }

    public ConsultHistory(Integer id, Date dateConsult, WeatherForecast json) {
        super();
        Id = id;
        this.dateConsult = dateConsult;
        this.json = json;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDateConsult() {
        return dateConsult;
    }

    public void setDateConsult(Date dateConsult) {
        this.dateConsult = dateConsult;
    }

    @Transient
    public WeatherForecast getJson() {
        return json;
    }

    public void setJson(WeatherForecast json) {
        this.json = json;
    }


}
