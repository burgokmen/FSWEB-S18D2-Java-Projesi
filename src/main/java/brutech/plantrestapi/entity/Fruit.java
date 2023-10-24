package brutech.plantrestapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "fruit", schema = "fsweb")
public class Fruit extends Produce {

    @Enumerated(EnumType.STRING)
    @Column(name = "fruit_type")
    private FruitType fruitType;
}
