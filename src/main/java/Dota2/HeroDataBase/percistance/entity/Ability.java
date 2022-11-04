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
@Table(name= "ability")
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ManyToOne
    @JoinColumn(name="hero_id", nullable=false)
    private Hero hero;

    public String name;
    public String name_loc;
    public String desc_loc;
    public String lore_loc;

    @ElementCollection
    public List<String> notes_loc;

    public String shard_loc;
    public String scepter_loc;
    public int type;
    public String behavior;
    public int target_team;
    public int target_type;
    public int flags;
    public int damage;
    public int immunity;
    public int dispellable;
    public int max_level;

    @ElementCollection
    public List<Integer> cast_ranges;

    @ElementCollection
    public List<Double> cast_points;

    @ElementCollection
    public List<Double> channel_times;

    @ElementCollection
    public List<Double> cooldowns;

    @ElementCollection
    public List<Double> durations;

    @ElementCollection
    public List<Integer> damages;

    @ElementCollection
    public List<Integer> mana_costs;

    @ElementCollection
    public List<Integer> gold_costs;

    @OneToMany(mappedBy = "ability",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public List<SpecialValue> special_values;

    public boolean is_item;
    public boolean ability_has_scepter;
    public boolean ability_has_shard;
    public boolean ability_is_granted_by_scepter;
    public boolean ability_is_granted_by_shard;
    public int item_cost;
    public int item_initial_charges;
    public String item_neutral_tier;
    public int item_stock_max;
    public int item_stock_time;
    public int item_quality;
}
