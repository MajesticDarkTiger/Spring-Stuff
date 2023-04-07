package com.OnePercenterTravel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.Amenity;
import com.OnePercenterTravel.Repo.AmenityRepo;

@Service
public class AmenityService {

    @Autowired
    AmenityRepo amenityRepo;

    //Create

    public Amenity save(Amenity amenity) {
        return amenityRepo.save(amenity);
    }

    // read
    public Amenity findById(Integer id) {
        return amenityRepo.findById(id).get();
    }

    public List<Amenity> findAll() {
        return amenityRepo.findAll();
    }

    

    // update
    public Amenity update(Amenity amenity) throws Exception {

        if(amenity.getId() == null) {
            // throwing your own exception will stop
            throw new Exception("No current Amenity, try again Billy!");
        }

        return amenityRepo.save(amenity);
    }

    
    // delete
    public void deleteAmenityById(Integer id) {
        amenityRepo.deleteById(id);
    }


}
