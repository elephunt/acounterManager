package manager;

import common.jpa.StatisticsJpa;
import org.springframework.beans.factory.annotation.Autowired;
import repository.StatisticsRepository;

import java.util.List;

/**
 * Created by roman on 10/07/17.
 */
public class StatisticsManager {

    @Autowired
    private StatisticsRepository statisticsRepository;


   public List<StatisticsJpa> getAllStatsByPlayerId(Long id){
        return statisticsRepository.findStatisticsJpaById(id);
    }

}
