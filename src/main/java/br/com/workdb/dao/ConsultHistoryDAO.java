package br.com.workdb.dao;

import br.com.workdb.model.ConsultHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConsultHistoryDAO extends JpaRepository<ConsultHistory, Integer> {

}
