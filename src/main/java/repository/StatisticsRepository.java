package repository;

import document.StatisticData;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;

/**
 * Created by roman on 10/07/17.
 */
public interface StatisticsRepository extends CouchbaseRepository<StatisticData, Long> {

    List<StatisticData> findById(Long id);


}
