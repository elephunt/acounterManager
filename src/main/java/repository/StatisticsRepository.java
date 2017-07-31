package repository;

import common.jpa.StatisticsJpa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by roman on 10/07/17.
 */

public interface StatisticsRepository extends CrudRepository<StatisticsJpa,Long> {

    List<StatisticsJpa> findStatisticsJpaById(Long id);

}
