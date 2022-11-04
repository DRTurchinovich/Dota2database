package Dota2.HeroDataBase.percistance.repository;

import Dota2.HeroDataBase.percistance.entity.Data;
import Dota2.HeroDataBase.percistance.entity.Talent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalentRepository extends JpaRepository<Talent, Long> {
}
