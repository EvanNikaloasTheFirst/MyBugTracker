package com.bugTrackerx.bugTracker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class Projects {

    private Integer id;

    private Integer userId;

    private String name;

    private String description;


}
