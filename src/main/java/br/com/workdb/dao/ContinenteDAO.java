package br.com.workdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workdb.model.Continente;

public interface ContinenteDAO extends JpaRepository<Continente, Integer> {

}
