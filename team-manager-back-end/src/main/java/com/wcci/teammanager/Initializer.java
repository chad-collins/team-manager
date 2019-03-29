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
		
		Division nfcNorth = divisionRepo.save(new Division("NFC North", NFC));
		Division nfcSouth = divisionRepo.save(new Division("NFC South", NFC));
		Division nfcWest = divisionRepo.save(new Division("NFC West", NFC));
		Division nfcEast = divisionRepo.save(new Division("NFC East", NFC));

		Team bears = teamRepo.save(new Team("Chicago Bears", "../images/initializer/bears.jpg", "Chicago, IL", nfcNorth));
		Team packers = teamRepo.save(new Team("Green Bay Packers", "../images/initializer/packers.jpg", "Green Bay, WI", nfcNorth));
		Team vikings = teamRepo.save(new Team("Minnesota Vikings", "../images/initializer/vikings.jpg", "Minneapolis, MN", nfcNorth));
		Team lions = teamRepo.save(new Team("Detroit Lions", "../images/initializer/lions.png", "Detroit, MI", nfcNorth));
		Team panthers = teamRepo.save(new Team("Carolina Panthers", "../images/initializer/panthers.jpg", "Charlotte, NC", nfcSouth));
		Team buccaneers = teamRepo.save(new Team("Tampa Bay Buccaneers", "../images/initializer/buccaneers.jpg", "Tampa, FL", nfcSouth));
		Team falcons = teamRepo.save(new Team("Atlanta Falcons", "../images/initializer/falcons.jpg", "Atlanta, GA", nfcSouth));
		Team saints = teamRepo.save(new Team("New Orleans Saints", "../images/initializer/saints.jpg", "New Orleans, LA", nfcSouth));	
		Team giants = teamRepo.save(new Team("New York Giants", "../images/initializer/giants.jpg", "New York, NY", nfcEast));
		Team cowboys = teamRepo.save(new Team("Dallas Cowboys", "../images/initializer/cowboys.jpg", "Arlington, TX", nfcEast));
		Team eagles = teamRepo.save(new Team("Philadelphia Eagles", "../images/initializer/eagles.jpg", "Philadelphia, PA", nfcEast));		
		Team redskins = teamRepo.save(new Team("Washington Redskins", "../images/initializer/redskins.gif", "Washington D.C.", nfcEast));
		Team cardinals = teamRepo.save(new Team("Arizona Cardinals", "../images/initializer/cardinals.jpg", "Phoenix, AZ", nfcWest));
		Team rams = teamRepo.save(new Team("Los Angeles Rams", "../images/initializer/rams.jpg", "Los Angeles, CA", nfcWest));
		Team fortyniners = teamRepo.save(new Team("San Fransisco 49ers", "../images/initializer/49ers.jpg", "San Fransisco, CA", nfcWest));
		Team seahawks = teamRepo.save(new Team("Seattle Seahawks", "../images/initializer/seahawks.jpg", "Seattle, WA", nfcWest));


	
		
	
		
		
	
		
		
		
	}
	
	

}
