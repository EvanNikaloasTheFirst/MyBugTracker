package com.bugTrackerx.bugTracker.Controller;


import com.bugTrackerx.bugTracker.Model.User;
import com.bugTrackerx.bugTracker.Repository.UserRepo;
import com.bugTrackerx.bugTracker.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MainController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    UserService userService;

    @Autowired
    SessionController sessionController;


    // posting data to database
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userRepo.save(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    //    Getting a specific user
    @GetMapping("/getUser/{id}")
    public User getAUser(@PathVariable String id){
        return userRepo.findById("1").orElse(null);
    }
//
//    @PutMapping("/updateUser")
//    public void updateUser(@RequestBody User user){
//        User userToUpdate = userRepo.findById(user.getRno()).orElse(null);
//        System.out.println(userToUpdate);
//        if(userToUpdate != null){
//            userToUpdate.setName(user.getName());
//            userRepo.save(userToUpdate);
//        }
//    }

//    // delete a given user
//    @DeleteMapping("/deleteUser/{id}")
//    public void deleteUser(@PathVariable Integer id){
//        userRepo.deleteById(id);
//    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        User user = userRepo.findByEmail(email);

        if(user!= null && user.getPassword().equals(password)){
//            session.setAttribute("userId",user.getId());
            return "Login Successfull";
        }
       return "Inavlid details";
    }

    @GetMapping("/")
    public String home(){
        return "Hello world";
    }
}
