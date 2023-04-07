package com.TwoWheelsDown.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TwoWheelsDown.Entity.Bike;
import com.TwoWheelsDown.Repo.BikeRepo;

@Service
public class BikeService {

    @Autowired
    BikeRepo bikeRepo;

    // create

    public Bike createABike(Bike bike) {
        return bikeRepo.save(bike);
    }


    // read
    public Bike findBikeById(Integer id) {
        return bikeRepo.findById(id).get();
    }

    public Bike findBikeByMake(String make) {
        return bikeRepo.findByMake(make);
    }

    public Bike findBikeByModel(String model) {
        return bikeRepo.findByModel(model);
    }


    public Bike findBikeByYear(Integer year) {
        return bikeRepo.findByYear(year);
    }



    // update
    public Bike updateBike(Bike bike) throws Exception {

        if(bike.getId() == null) {
            throw new Exception("That does't exist, please try again.");
        }

        return bikeRepo.save(bike);
    }




    // delete
    public void deleteUserById(Integer id) {
        bikeRepo.deleteById(id);
    }


    
}
