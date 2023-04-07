package com.OnePercenterTravel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.Place;
import com.OnePercenterTravel.Repo.PlaceRepo;

@Service
public class PlaceService {

    @Autowired
    PlaceRepo placeRepo;

    //Create

    public Place save(Place place) {
        return placeRepo.save(place);
    }

    // read
    public Place findById(Integer id) {
        return placeRepo.findById(id).get();
    }

    public List<Place> findAll() {
        return placeRepo.findAll();
    }

    

    // update
    public Place update(Place place) throws Exception {

        if(place.getId() == null) {
            // throwing your own exception will stop
            throw new Exception("No current Place, try again Billy!");
        }

        return placeRepo.save(place);
    }

    
    // delete
    public void deletePlaceById(Integer id) {
        placeRepo.deleteById(id);
    }


}
