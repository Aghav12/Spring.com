package com.BikkadIT.MakeMyTripClientApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.MakeMyTripClientApp.request.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}
