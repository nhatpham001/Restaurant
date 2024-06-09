package com.restaurant;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomepageRepository extends MongoRepository<Homepage, String>{


}
