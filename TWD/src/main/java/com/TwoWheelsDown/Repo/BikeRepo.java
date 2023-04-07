package com.TwoWheelsDown.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.TwoWheelsDown.Entity.Bike;

@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer> {

    @Query(value = "select * from bike where make = ?1", nativeQuery = true)
    public Bike findByMake(String make);

    @Query(value = "select * from bike where model = ?1", nativeQuery = true)
    public Bike findByModel(String model);

    @Query(value = "select * from bike where year = ?1", nativeQuery = true)
    public Bike findByYear(Integer year);



    // @Query(value = "select * from user where email = ?1", nativeQuery = true)
    // public User findByEmail(String email);
}
