package manager;

import document.StatisticData;
import org.springframework.beans.factory.annotation.Autowired;
import repository.StatisticsRepository;

import java.util.List;

/**
 * Created by roman on 10/07/17.
 */
public class StatisticsManager {

    @Autowired
    private StatisticsRepository statisticsRepository;


    public List<StatisticData> getAllDataById(Long id) {
        return statisticsRepository.findById(id);
    }


}
