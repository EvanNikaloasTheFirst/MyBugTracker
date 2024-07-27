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
public class Bugs {

    private Integer id;

    private String title;

    private String description;

    private String status;

    private String priority;

    private String projectId;
}
