package com.mandava.springboot.onetoone;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class PlayerProfileController {
	@Autowired
	PlayerProfileService profileService;
	
	@GetMapping
	public List<PlayerProfile> allPlayerProfiles() {
		return profileService.getAllPlayerProfiles();
	}
	
	@GetMapping("/{id}")
	public PlayerProfile getPlayerProfile(@PathVariable int id) {
		return profileService.getPlayerProfile(id);
	}
	
	@PostMapping
	public PlayerProfile addPlayerProfile(@RequestBody PlayerProfile pp) {
		return profileService.addPlayerProfile(pp);
	}
	
	@DeleteMapping("/{id}")
	public void deletePlayerProfile(@PathVariable int id) {
		profileService.deletePlayerProfile(id);
	}

}
