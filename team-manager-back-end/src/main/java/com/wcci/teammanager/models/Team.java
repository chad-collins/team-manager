package com.wcci.teammanager.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long teamId;
	private String teamName;
	private String teamLogo;
	private String location;
	@ManyToOne
	@JsonIgnore
	private Division division;

	public Team() {}
	
	
	public Team(String teamName, String teamLogo, String location, Division division) {
		this.teamName = teamName;	
		this.teamLogo = teamLogo;
		this.location = location;
		this.division = division;
	
	}
	
	
	public Long getTeamId() {
		return teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public String getTeamLogo() {
		return teamLogo;
	}

	public String getLocation() {
		return location;
	}


	public Division getDivision() {
		return division;
	}


	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", location=" + location +"]";
	}


	
}
