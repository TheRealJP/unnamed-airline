package com.badwitsoftware.flightreservation.reservation;

import org.springframework.data.jpa.repository.JpaRepository;

 interface ReservationRepository extends JpaRepository<Reservation, Long> {

}