package com.mandava.springboot.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "profile_id", referencedColumnName = "id")
	private PlayerProfile playerProfile;
	
	public Player() {
		
	}
	public Player(String name, PlayerProfile playerProfile) {
		super();
		this.name = name;
		this.playerProfile = playerProfile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PlayerProfile getPlayerProfile() {
		return playerProfile;
	}
	public void setPlayerProfile(PlayerProfile playerProfile) {
		this.playerProfile = playerProfile;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", playerProfile=" + playerProfile + "]";
	}
		

}
