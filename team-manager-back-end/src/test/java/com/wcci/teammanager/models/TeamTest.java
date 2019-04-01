package com.wcci.teammanager.models;

import javax.annotation.Resource;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wcci.teammanager.repositories.ConferenceRepository;
import com.wcci.teammanager.repositories.DivisionRepository;
import com.wcci.teammanager.repositories.TeamRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class TeamTest {

	@Resource
	private TestEntityManager entityManager;
	@Resource
	private ConferenceRepository conferenceRepo;
	@Resource
	private DivisionRepository divisionRepo;
	@Resource
	private TeamRepository teamRepo;
	
	@Test
	public void shouldFindTeamByName() {
		Conference conference = conferenceRepo.save(new Conference("AFC"));
		Division division = divisionRepo.save(new Division("AFC North", conference));
		Team team = teamRepo.save(new Team("Bengals", "image", "Cincinnati", division));
		
		entityManager.persist(team);
		entityManager.flush();
		entityManager.clear();
		
		Team teamFromDatabase = teamRepo.findByTeamName("Bengals");
		assertThat(teamFromDatabase.getTeamName(), is("Bengals"));
	}

}
