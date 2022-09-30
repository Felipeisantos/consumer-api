package br.com.workdb.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.ScopeMetadata;

@Entity
@Table(name = "consult_history")
public class ConsultHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "date_consult")
    private Date dateConsult;


    @Type(type = "com.vladmihalcea.hibernate.type.json.JsonBinaryType")
    @Column(name = "json")
    private JsonNode json;

    public ConsultHistory() {
        super();
    }

    public ConsultHistory(Integer id, Date dateConsult, JsonNode json) {
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
    public JsonNode getJson() {
        return json;
    }

    public void setJson(JsonNode json) {
        this.json = json;
    }

    @Column(name = "json")
    public String getJsonString() { // This is for JPA
        return this.json.toString();
    }

    public void setJsonString(String jsonString) { // This is for JPA
        // parse from String to JsonNode object
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.json = mapper.readTree(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
