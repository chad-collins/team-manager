package com.wcci.teammanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wcci.teammanager.models.Division;

@Repository
public interface DivisionRepository extends CrudRepository<Division, Long> {

}
