package food.domain;

import food.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "alerts", path = "alerts")
public interface AlertRepository
    extends PagingAndSortingRepository<Alert, Long> {}
