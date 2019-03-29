package com.wcci.teammanager.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.teammanager.models.Conference;
import com.wcci.teammanager.repositories.ConferenceRepository;
import com.wcci.teammanager.repositories.DivisionRepository;
import com.wcci.teammanager.repositories.TeamRepository;


@RestController
@RequestMapping("/conferences")
public class ConferenceController {
	
	@Resource
	ConferenceRepository conferenceRepo;
	@Resource
	DivisionRepository divisionRepo;
	@Resource
	TeamRepository teamRepo;
	
	@GetMapping("")
	public Collection<Conference> getConferences() {
		return (Collection<Conference>) conferenceRepo.findAll();
	}
	
//	@PostMapping("/add")
//	public Collection<Conference> addConference(@RequestBody String body) throws JSONException {
//		JSONObject newConference = new JSONObject(body);
//		String conferenceName = newConference.getString("conferenceName");
//		conferenceRepo.save(new Conference(conferenceName));
//		return (Collection<Conference>) conferenceRepo.findAll();
//	}

}
