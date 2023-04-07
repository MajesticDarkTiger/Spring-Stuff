package com.TwoWheelsDown.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TwoWheelsDown.Entity.User;
import com.TwoWheelsDown.Repo.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    
    public User signUp(User user) {
        return userRepo.save(user);
    }

    public User findUserById(Integer id) {
        return userRepo.findById(id).get();
    }

    public User signIn(User user) throws Exception {
        
        User loggedInUser = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if(loggedInUser == null) {
            throw new Exception("User not found, try again billy.");
        }

        return loggedInUser;

    }

    public User findUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public User update(User user) throws Exception {

        if(user.getId() == null) {
            throw new Exception("That does't exist, please try again.");
        }

        return userRepo.save(user);
    }

    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }

}
