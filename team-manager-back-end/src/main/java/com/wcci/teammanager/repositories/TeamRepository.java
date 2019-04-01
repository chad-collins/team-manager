package com.wcci.teammanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wcci.teammanager.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long>{

	Team findByTeamName(String string);

}
