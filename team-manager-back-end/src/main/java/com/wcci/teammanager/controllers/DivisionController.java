package com.wcci.teammanager.controllers;
import java.util.Collection;

import javax.annotation.Resource;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcci.teammanager.models.Conference;
import com.wcci.teammanager.models.Division;
import com.wcci.teammanager.repositories.ConferenceRepository;
import com.wcci.teammanager.repositories.DivisionRepository;
import com.wcci.teammanager.repositories.TeamRepository;


@RestController
@RequestMapping("/divisions")
public class DivisionController {
	
	@Resource
	DivisionRepository divisionRepo;
	@Resource
	ConferenceRepository conferenceRepo;
	@Resource
	TeamRepository teamRepo;
	
	@GetMapping("")
	public Collection<Division> getDivisions() {
		return (Collection<Division>) divisionRepo.findAll();
	}
	
	@PostMapping("/add/{id}")
	public Collection<Conference>addDivision(@PathVariable Long id, @RequestBody String body) throws JSONException {
		JSONObject newDivision = new JSONObject(body);
		String divisionName = newDivision.getString("divisionName");
		Conference conference = conferenceRepo.findById(id).get();
		divisionRepo.save(new Division (divisionName, conference));
			return (Collection<Conference>)conferenceRepo.findAll();
	}
}
