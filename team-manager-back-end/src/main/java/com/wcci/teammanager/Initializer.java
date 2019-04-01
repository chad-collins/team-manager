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
		Conference test = conferenceRepo.save(new Conference("AFC"));
		
		Division nfcNorth = divisionRepo.save(new Division("NFC North", NFC));
		Division nfcSouth = divisionRepo.save(new Division("NFC South", NFC));
		Division nfcWest = divisionRepo.save(new Division("NFC West", NFC));
		Division nfcEast = divisionRepo.save(new Division("NFC East", NFC));
		Division afcNorth = divisionRepo.save(new Division("AFC North", NFC));

		teamRepo.save(new Team("Chicago Bears", "http://www.capsinfo.com/images/NFL/image006.gif", "Chicago, IL", nfcNorth));
		teamRepo.save(new Team("Green Bay Packers", "http://www.capsinfo.com/images/NFL/image012.gif", "Green Bay, WI", nfcNorth));
		teamRepo.save(new Team("Minnesota Vikings", "http://www.capsinfo.com/images/NFL/image018.gif", "Minneapolis, MN", nfcNorth));
		teamRepo.save(new Team("Detroit Lions", "http://www.capsinfo.com/images/NFL/image011.gif", "Detroit, MI", nfcNorth));
		teamRepo.save(new Team("Carolina Panthers", "http://www.capsinfo.com/images/NFL/image005.gif", "Charlotte, NC", nfcSouth));
		teamRepo.save(new Team("Tampa Bay Buccaneers", "http://www.capsinfo.com/images/NFL/image030.gif", "Tampa, FL", nfcSouth));
		teamRepo.save(new Team("Atlanta Falcons", "http://www.capsinfo.com/images/NFL/image002.gif", "Atlanta, GA", nfcSouth));
		teamRepo.save(new Team("New Orleans Saints", "http://www.capsinfo.com/images/NFL/image020.gif", "New Orleans, LA", nfcSouth));	
		teamRepo.save(new Team("New York Giants", "http://www.capsinfo.com/images/NFL/image021.gif", "New York, NY", nfcEast));
		teamRepo.save(new Team("Dallas Cowboys", "http://www.capsinfo.com/images/NFL/image009.gif", "Arlington, TX", nfcEast));
		teamRepo.save(new Team("Philadelphia Eagles", "http://www.capsinfo.com/images/NFL/image024.gif", "Philadelphia, PA", nfcEast));		
		teamRepo.save(new Team("Washington Redskins", "http://www.capsinfo.com/images/NFL/image032.gif", "Washington D.C.", nfcEast));
		teamRepo.save(new Team("Arizona Cardinals", "http://www.capsinfo.com/images/NFL/image001.gif", "Phoenix, AZ", nfcWest));
		teamRepo.save(new Team("Los Angeles Rams", "http://www.capsinfo.com/images/NFL/image026.gif", "Los Angeles, CA", nfcWest));
		teamRepo.save(new Team("San Fransisco 49ers", "http://www.capsinfo.com/images/NFL/image028.gif", "San Fransisco, CA", nfcWest));
		teamRepo.save(new Team("Seattle Seahawks", "http://www.capsinfo.com/images/NFL/image029.gif", "Seattle, WA", nfcWest));

		teamRepo.save(new Team("Cleveland Browns", "http://www.capsinfo.com/images/NFL/image008.gif", "Cleveland, OH", afcNorth));
		teamRepo.save(new Team("Cincinatti Bengals", "http://www.capsinfo.com/images/NFL/image007.gif", "Cincinatti, OH", afcNorth));

	
		
	
		
		
	
		
		
		
	}
	
	

}
