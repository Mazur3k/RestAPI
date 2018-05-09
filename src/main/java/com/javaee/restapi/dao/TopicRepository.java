package com.javaee.restapi.dao;


import com.javaee.restapi.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
