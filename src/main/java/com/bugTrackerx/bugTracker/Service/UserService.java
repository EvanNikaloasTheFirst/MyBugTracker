package com.bugTrackerx.bugTracker.Service;


import com.bugTrackerx.bugTracker.Model.User;
import com.bugTrackerx.bugTracker.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User authenticate(String email, String password){
        User user = userRepo.findByEmail(email);

        System.out.println("Email " + email + password + "<<<");
        if(user!= null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
