package com.wcci.teammanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wcci.teammanager.models.Conference;

@Repository
public interface ConferenceRepository extends CrudRepository<Conference, Long> {

}
