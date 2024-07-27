package com.bugTrackerx.bugTracker.Repository;

import com.bugTrackerx.bugTracker.Model.Projects;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepo extends MongoRepository<Projects,String> {
}
