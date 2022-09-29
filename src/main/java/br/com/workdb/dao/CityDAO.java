package br.com.workdb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.workdb.model.City;

public interface CityDAO extends JpaRepository<City, Integer> {

	@Query(value = "SELECT * FROM city where country_id = :id ", nativeQuery = true)
	List<City> getCitiesByCountryId(@Param("id") Integer id);

	@Query(value = "SELECT * FROM city where id = :id ", nativeQuery = true)
	City getCityById(@Param("id") Integer id);

}
