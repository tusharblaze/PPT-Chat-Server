package com.ppt.chat.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ppt.chat.domain.Users;

@Repository
public interface UsersRepo extends MongoRepository<Users, String> {

}
