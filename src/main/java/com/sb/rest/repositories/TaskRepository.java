package com.sb.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sb.rest.entities.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
