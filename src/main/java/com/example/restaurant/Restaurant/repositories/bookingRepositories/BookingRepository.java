package com.example.restaurant.Restaurant.repositories.bookingRepositories;

import com.example.restaurant.Restaurant.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
