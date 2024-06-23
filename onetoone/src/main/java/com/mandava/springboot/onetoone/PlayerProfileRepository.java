package com.mandava.springboot.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {

}
