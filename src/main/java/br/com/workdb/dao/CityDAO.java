package br.com.workdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workdb.model.City;

public interface CityDAO extends JpaRepository<City, Integer> {

}
