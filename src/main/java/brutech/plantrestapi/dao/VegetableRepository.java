package brutech.plantrestapi.dao;

import brutech.plantrestapi.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

}
