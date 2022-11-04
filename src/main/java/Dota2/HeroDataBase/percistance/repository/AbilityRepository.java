package Dota2.HeroDataBase.percistance.repository;

import Dota2.HeroDataBase.percistance.entity.Ability;
import Dota2.HeroDataBase.percistance.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilityRepository extends JpaRepository<Ability, Long> {
}
