package com.mandava.springboot.onetoone;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository repo;
	
	public List<Player> allPlayers() {
		return repo.findAll();
	}

	public Player getPlayer(int id) {
		return repo.findById(id).get();
	}
	
	public Player addPlayer(Player p) {
		p.setId(0);
		return repo.save(p);
		
	}
	
	public void deletePlayer(int id) {
		repo.deleteById(id);
	}
	
	public Player assignProfile(int id, PlayerProfile pp) {
		Player p = repo.findById(id).get();
		p.setPlayerProfile(pp);
		return repo.save(p);
	}
}
