package com.example.restaurant.Restaurant.controllers;

import com.example.restaurant.Restaurant.models.Booking;
import com.example.restaurant.Restaurant.repositories.bookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getAllBookingsForDate(@PathVariable String date){
        return bookingRepository.getAllBookingsForDate(date);
    }
}
