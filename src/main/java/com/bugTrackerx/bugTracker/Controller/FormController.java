package com.bugTrackerx.bugTracker.Controller;

import com.bugTrackerx.bugTracker.Model.Bugs;
import com.bugTrackerx.bugTracker.Model.Projects;
import com.bugTrackerx.bugTracker.Repository.BugRepo;
import com.bugTrackerx.bugTracker.Repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class FormController {

    @Autowired
    BugRepo bugRepo;

    @Autowired
    ProjectRepo projectRepo;

    @PostMapping("/createBug")
    public void submitBugForm(@RequestBody Bugs form){
        bugRepo.save(form);
    }

    @PostMapping("/createProject")
    public void submitProject(@RequestBody Projects form){
        projectRepo.save(form);
    }

}
