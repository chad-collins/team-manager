package com.wcci.teammanager;
import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.wcci.teammanager.models.Conference;
import com.wcci.teammanager.models.Division;
import com.wcci.teammanager.models.Team;
import com.wcci.teammanager.repositories.ConferenceRepository;
import com.wcci.teammanager.repositories.DivisionRepository;
import com.wcci.teammanager.repositories.TeamRepository;


@Service
public class Initializer implements CommandLineRunner {

	@Resource
	TeamRepository teamRepo;

	@Resource
	ConferenceRepository conferenceRepo;
	@Resource
	DivisionRepository divisionRepo;

	
	
	@Override
	public void run(String... args) throws Exception {
		
		Conference NFC = conferenceRepo.save(new Conference("NFC"));
		Conference AFC = conferenceRepo.save(new Conference("AFC"));
		
		Division nfcNorth = divisionRepo.save(new Division("North", NFC));
		Division nfcSouth = divisionRepo.save(new Division("South", NFC));
		Division nfcWest = divisionRepo.save(new Division("West", NFC));
		Division nfcEast = divisionRepo.save(new Division("East", NFC));
		
		Division afcNorth = divisionRepo.save(new Division("North", AFC));
		

		teamRepo.save(new Team("Chicago Bears", "../images/initializer/bears.jpg", "Chicago, IL", nfcNorth));
		teamRepo.save(new Team("Green Bay Packers", "../images/initializer/packers.jpg", "Green Bay, WI", nfcNorth));
		teamRepo.save(new Team("Minnesota Vikings", "../images/initializer/vikings.jpg", "Minneapolis, MN", nfcNorth));
		teamRepo.save(new Team("Detroit Lions", "../images/initializer/lions.png", "Detroit, MI", nfcNorth));
		teamRepo.save(new Team("Carolina Panthers", "../images/initializer/panthers.jpg", "Charlotte, NC", nfcSouth));
		teamRepo.save(new Team("Tampa Bay Buccaneers", "../images/initializer/buccaneers.jpg", "Tampa, FL", nfcSouth));
		teamRepo.save(new Team("Atlanta Falcons", "../images/initializer/falcons.jpg", "Atlanta, GA", nfcSouth));
		teamRepo.save(new Team("New Orleans Saints", "../images/initializer/saints.jpg", "New Orleans, LA", nfcSouth));	
		teamRepo.save(new Team("New York Giants", "../images/initializer/giants.jpg", "New York, NY", nfcEast));
		teamRepo.save(new Team("Dallas Cowboys", "../images/initializer/cowboys.jpg", "Arlington, TX", nfcEast));
		teamRepo.save(new Team("Philadelphia Eagles", "../images/initializer/eagles.jpg", "Philadelphia, PA", nfcEast));		
		teamRepo.save(new Team("Washington Redskins", "../images/initializer/redskins.gif", "Washington D.C.", nfcEast));
		teamRepo.save(new Team("Arizona Cardinals", "../images/initializer/cardinals.jpg", "Phoenix, AZ", nfcWest));
		teamRepo.save(new Team("Los Angeles Rams", "../images/initializer/rams.jpg", "Los Angeles, CA", nfcWest));
		teamRepo.save(new Team("San Fransisco 49ers", "../images/initializer/49ers.jpg", "San Fransisco, CA", nfcWest));
		teamRepo.save(new Team("Seattle Seahawks", "../images/initializer/seahawks.jpg", "Seattle, WA", nfcWest));

		teamRepo.save(new Team("Cleveland Browns", "https://upload.wikimedia.org/wikipedia/en/d/d9/Cleveland_Browns_logo.svg", "Cleveland, OH", afcNorth));
	
		
	
		
		
	
		
		
		
	}
	
	

}
