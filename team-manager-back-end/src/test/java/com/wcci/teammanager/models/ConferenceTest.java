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

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class ConferenceTest {
	
	@Resource
	private TestEntityManager entityManager;
	@Resource
	private ConferenceRepository conferenceRepo;
	

	@Test
	public void shouldFindConferenceByName() {
		Conference conference = conferenceRepo.save(new Conference("AFC"));
		
		entityManager.persist(conference);
		entityManager.flush();
		entityManager.clear();
		
		Conference conferenceFromDatabase = conferenceRepo.findByConferenceName("AFC");
		assertThat(conferenceFromDatabase.getConferenceName(), is("AFC"));
	}

}
