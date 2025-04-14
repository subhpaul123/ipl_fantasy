package com.ipl.ipl_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayer(String playerName);
    Optional<Player> findByPlayer(String name);
}
