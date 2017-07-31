package controller;

import common.jpa.StatisticsJpa;
import manager.StatisticsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by roman on 10/07/17.
 */
@RestController("/stats")
public class Controller {

    @Autowired
    private StatisticsManager manager;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String getAllData() {
        return "WZUPP";
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public List<StatisticsJpa> getAllStats(Long idPlayer){
        return manager.getAllStatsByPlayerId(idPlayer);
    }
}
