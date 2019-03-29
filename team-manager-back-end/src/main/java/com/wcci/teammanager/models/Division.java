package com.wcci.teammanager.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Division {
	
	@Id
	@GeneratedValue
	private Long divisionId;
	private String divisionName;
	@OneToMany(mappedBy="division")
	private Collection <Team> teams;
	@ManyToOne
	@JsonIgnore
	private Conference conference;
	
	public Division() {}
	
	public Division(String divisionName, Conference conference) {
	
		this.divisionName = divisionName;
		this.teams = new ArrayList<Team>();
		this.conference = conference;
	}



	public Long getDivisionId() {
		return divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public Collection<Team> getTeams() {
		return teams;
	}

	public Conference getConference() {
		return conference;
	}



	@Override
	public String toString() {
		return "Division [divisionId=" + divisionId + ", divisionName=" + divisionName + ", teams=" + teams
				+ ", conference=" + conference + "]";
	}
	
	

}
