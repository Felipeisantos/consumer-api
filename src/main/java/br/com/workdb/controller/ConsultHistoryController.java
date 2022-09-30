package br.com.workdb.controller;

import br.com.workdb.dao.ConsultHistoryDAO;
import br.com.workdb.model.ConsultHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consulthistory")
public class ConsultHistoryController {

    @Autowired
    private ConsultHistoryDAO consultHistoryDAO;

    @GetMapping
    @CrossOrigin(origins = "*")
    public Iterable<ConsultHistory> consultHistoryAll() {
        return consultHistoryDAO.findAll();
    }

}
