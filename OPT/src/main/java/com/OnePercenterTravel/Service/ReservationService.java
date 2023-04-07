package com.OnePercenterTravel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnePercenterTravel.Entity.Reservation;
import com.OnePercenterTravel.Repo.ReservationRepo;

@Service
public class ReservationService {

    @Autowired
    ReservationRepo reservationRepo;

    //Create

    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    // read
    public Reservation findById(Integer id) {
        return reservationRepo.findById(id).get();
    }

    public List<Reservation> findAll() {
        return reservationRepo.findAll();
    }


    // update
    public Reservation update(Reservation reservation) throws Exception {

        if(reservation.getId() == null) {
            // throwing your own exception will stop
            throw new Exception("No current Reservation, try again Billy!");
        }

        return reservationRepo.save(reservation);
    }

    
    // delete
    public void deleteReservationById(Integer id) {
        reservationRepo.deleteById(id);
    }


}
