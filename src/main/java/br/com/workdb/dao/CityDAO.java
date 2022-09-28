package br.com.workdb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.workdb.model.City;

public interface CityDAO extends JpaRepository<City, Integer> {

	@Query(value = "SELECT c.id, c.nome FROM city c where c.country_id = :id", nativeQuery = true)
    List<City> getCitiesById(@Param("id") Integer id);
	
	
}
