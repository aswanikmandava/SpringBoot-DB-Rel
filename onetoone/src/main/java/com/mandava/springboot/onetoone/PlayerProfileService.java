package com.mandava.springboot.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {
	@Autowired
	PlayerProfileRepository repo;
	
	public List<PlayerProfile> getAllPlayerProfiles() {
		return repo.findAll();
	}
	
	public PlayerProfile getPlayerProfile(int id) {
		return repo.findById(id).get();
	}
	
	public PlayerProfile addPlayerProfile(PlayerProfile pp) {
		pp.setId(0);
		return repo.save(pp);
	}
	
	public void deletePlayerProfile(int id) {
		repo.deleteById(id);
	}

}
