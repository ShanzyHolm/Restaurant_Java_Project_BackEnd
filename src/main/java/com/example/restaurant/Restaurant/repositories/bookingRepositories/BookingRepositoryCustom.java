package com.example.restaurant.Restaurant.repositories.bookingRepositories;

import com.example.restaurant.Restaurant.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getAllBookingsForDate(String date);
}
