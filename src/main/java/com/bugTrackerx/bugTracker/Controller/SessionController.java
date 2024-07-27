package com.bugTrackerx.bugTracker.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping("/set")
    public String setSessionName(@RequestParam String userId, HttpSession session) {
        // Store user ID in session
        session.setAttribute("userId", userId);
        return "User ID stored in session: " + userId;
    }


}
