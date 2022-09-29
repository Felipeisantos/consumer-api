package br.com.workdb.dao;

import br.com.workdb.model.ConsultHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultHistoryDAO extends JpaRepository<ConsultHistory, Integer> {

}
