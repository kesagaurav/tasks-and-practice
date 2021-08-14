package com.gaurav.model;

public class Player {

	private int player_id;
	private String name;
	private int age;
	private String gender;
	private String city;
	private String sportsName;
	private Long contact;
	private Team team;
	public Player() {
		super();
	}
	public Player(int player_id, String name, int age, String gender, String city, String sportsName, Long contact,Team team) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.sportsName = sportsName;
		this.contact = contact;
		this.team=team;
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city="
				+ city + ", sportsName=" + sportsName + ", contact=" + contact + ", team=" + team + "]";
	}
	
	
	
	
}
