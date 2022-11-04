package Dota2.HeroDataBase.percistance.repository;

import Dota2.HeroDataBase.percistance.entity.Data;
import Dota2.HeroDataBase.percistance.entity.SpecialValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialValueRepository extends JpaRepository<SpecialValue, Long> {
}
