package br.com.workdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.workdb.model.Distritos;

public interface DistritoDAO extends JpaRepository<Distritos, Integer> {

}
