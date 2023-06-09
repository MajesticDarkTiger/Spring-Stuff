package com.OnePercenterTravel.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="reservation")
public class Reservation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // One way or round trip
    @Column(name = "roundtrip")
    private Boolean roundtrip;
    @Column(name = "number_of_people")
    private Integer numberOfPeople;
    @Column(name = "start_of_trip")
    private LocalDateTime startOfTrip;
    @Column(name = "end_of_trip")
    private LocalDateTime endOfTrip;
    @ManyToMany
    @JoinTable(
        name = "reservtion_place",
        joinColumns=
            @JoinColumn(name="reservation_id", referencedColumnName="id"),
        inverseJoinColumns=
            @JoinColumn(name="place_id", referencedColumnName="id")
        )
    private List<Place> placeOfTravel;
    


    public Reservation() {
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Boolean getRoundtrip() {
        return roundtrip;
    }
    public void setRoundtrip(Boolean roundtrip) {
        this.roundtrip = roundtrip;
    }
    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }
    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
    public LocalDateTime getStartOfTrip() {
        return startOfTrip;
    }
    public void setStartOfTrip(LocalDateTime startOfTrip) {
        this.startOfTrip = startOfTrip;
    }
    public LocalDateTime getEndOfTrip() {
        return endOfTrip;
    }
    public void setEndOfTrip(LocalDateTime endOfTrip) {
        this.endOfTrip = endOfTrip;
    }
    public List<Place> getPlaceOfTravel() {
        return placeOfTravel;
    }
    public void setPlaceOfTravel(List<Place> placeOfTravel) {
        this.placeOfTravel = placeOfTravel;
    }

    @Override
    public String toString() {
        return "Reservation [id=" + id + ", roundtrip=" + roundtrip + ", numberOfPeople=" + numberOfPeople
                + ", startOfTrip=" + startOfTrip + ", endOfTrip=" + endOfTrip + ", placeOfTravel=" + placeOfTravel
                + "]";
    }
    
}
