package br.com.workdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workdb.model.Country;


public interface CountryDAO extends JpaRepository<Country, Integer>{

}
