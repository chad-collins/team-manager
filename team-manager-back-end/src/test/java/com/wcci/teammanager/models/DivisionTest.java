package com.wcci.teammanager.models;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wcci.teammanager.repositories.ConferenceRepository;
import com.wcci.teammanager.repositories.DivisionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class DivisionTest {
	
	@Resource
	private TestEntityManager entityManager;

	@Resource 
	private DivisionRepository divisionRepo;
	@Resource
	private ConferenceRepository conferenceRepo;
	
	
	@Test
	public void shouldFindDivisionByName() {
		Conference conference = conferenceRepo.save(new Conference("AFC"));
		Division division = divisionRepo.save(new Division("AFC East", conference));

		
		entityManager.persist(division);
		entityManager.flush();
		entityManager.clear();
		
		Division divisionFromDatabase = divisionRepo.findByDivisionName("AFC East");
		assertThat(divisionFromDatabase.getDivisionName(), is("AFC East"));
	}

}
