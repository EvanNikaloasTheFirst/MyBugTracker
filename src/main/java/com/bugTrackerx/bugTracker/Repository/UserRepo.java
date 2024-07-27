package com.bugTrackerx.bugTracker.Repository;

import com.bugTrackerx.bugTracker.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    User findByEmail(String email);


}
