package com.example.restaurant.Restaurant.projections;

import com.example.restaurant.Restaurant.models.Booking;
import com.example.restaurant.Restaurant.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookings", types = Customer.class)
public interface EmbedBookings {
    long getId();
    String getName();
    String number();
    List<Booking> getBookings();
}
