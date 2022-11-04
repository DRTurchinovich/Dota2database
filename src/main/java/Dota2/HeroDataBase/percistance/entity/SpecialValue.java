package Dota2.HeroDataBase.percistance.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;


@Component
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "special_value")
public class SpecialValue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    @JoinColumn(name= "talent_id", nullable=false)
    private Talent talent;

    @ManyToOne
    @JoinColumn(name= "ability_id", nullable=false)
    private Ability ability;

    public String name;

    @ElementCollection
    public List<Double> values_float;

    public boolean is_percentage;
    public String heading_loc;

    @OneToMany(mappedBy = "special_value", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public List<Bonus> bonuses;
}
