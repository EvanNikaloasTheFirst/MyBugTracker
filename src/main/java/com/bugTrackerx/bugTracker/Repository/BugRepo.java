package com.bugTrackerx.bugTracker.Repository;

import com.bugTrackerx.bugTracker.Model.Bugs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BugRepo extends MongoRepository<Bugs,String> {

}
