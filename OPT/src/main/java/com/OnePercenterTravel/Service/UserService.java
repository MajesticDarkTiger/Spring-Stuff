package com.OnePercenterTravel.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.Reservation;
import com.OnePercenterTravel.Entity.User;
import com.OnePercenterTravel.Repo.UserRepo;

/*
 * The job of the service is the ALL OF YOUR CRUD JAVA LOGIC
 * FOR YOUR ENTITY THEY CONTROL
 * You use your repo in your service, to actually make your 
 * Database changes. Do use your Repo here, you MUST AUTOWIRE IT!
 */

@Service
public class UserService {
    
    // This wil construct a spring bean in your file
    // This allows you to use the autowired class's funtion in this file
    // YOU ONLY AUTOWIRE THE REPO FOR YOUR OWN ENTITY
    // YOU SHOULD NOT AUTOWIRE ANY SERVICES IN YOUR SERVICE
    @Autowired
    UserRepo userRepo;

    // CRUD LOGIC GOES BELOW!!

    // CREATE

    public User signUp(User user) {
        return userRepo.save(user);
    }

    // READ

    public User findUserById(Integer id) {
        // Find by id isnt perfect, you need to do .get() on the end
        // to get your object off of the funtion
        return userRepo.findById(id).get();
    }

    public User findUserByEmail(String email) {
        // Find by id isnt perfect, you need to do .get() on the end
        // to get your object off of the funtion
        return userRepo.findByEmail(email);
    }
    

    public User signIn(User user) throws Exception {
        
        User loggedInUser = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if(loggedInUser == null) {
            throw new Exception("User not found, try again billy.");
        }

        return loggedInUser;

    }

    // UPDATE
                            // Must throws Exception when throwing custom errors
    public User update(User user) throws Exception {

        if(user.getId() == null) {
            // throwing your own exception will stop
            throw new Exception("Try again Billy!");
        }

        return userRepo.save(user);
    }

    public User addReservation(User user, Reservation reservation) {

        user.getReservation().add(reservation);

        return userRepo.save(user);
    }

    // DELETE

    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }

}
