package com.wcci.teammanager.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Conference {
	
	@Id
	@GeneratedValue
	private Long conferenceId;
	private String conferenceName;
	@OneToMany(mappedBy="conference")
	private Collection<Division> divisions;
	
	public Conference() {}

	public Conference(String conferenceName) {
		
		this.conferenceName = conferenceName;
		this.divisions = divisions;
	}

	public Long getConferenceId() {
		return conferenceId;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public Collection<Division> getDivisions() {
		return divisions;
	}

	@Override
	public String toString() {
		return "Conference [conferenceId=" + conferenceId + ", conferenceName=" + conferenceName + ", divisions="
				+ divisions + "]";
	}

	public void setName(String confName) {
		this.conferenceName = confName;
		
	}
	
	
}

