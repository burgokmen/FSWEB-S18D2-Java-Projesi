package brutech.plantrestapi.services;

import brutech.plantrestapi.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> getByPriceAsc();
    Fruit getById(Long id);
    List<Fruit> getByPriceDesc();
    Fruit save(Fruit fruit);
    Fruit delete(Long id);
    List<Fruit> searchByName(String name);
}
