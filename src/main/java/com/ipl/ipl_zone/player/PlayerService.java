package com.ipl.ipl_zone.player;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equalsIgnoreCase(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPlayer() != null &&
                        player.getPlayer().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByRole(String roleText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPayingRole() != null &&
                        player.getPayingRole().toLowerCase().contains(roleText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByCountry(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getCountry() != null &&
                        player.getCountry().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndRole(String team, String role) {
        return playerRepository.findAll().stream()
                .filter(player -> team.equalsIgnoreCase(player.getTeam()) &&
                        role.equalsIgnoreCase(player.getPayingRole()))
                .collect(Collectors.toList());
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByPlayer(updatedPlayer.getPlayer());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPayingRole(updatedPlayer.getPayingRole());
            playerToUpdate.setCountry(updatedPlayer.getCountry());
            // Update other fields as needed
            return playerRepository.save(playerToUpdate);
        }
        return null;
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByPlayer(playerName);
    }

}
