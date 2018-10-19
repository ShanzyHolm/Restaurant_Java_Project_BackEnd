package com.example.restaurant.Restaurant.projections;


import com.example.restaurant.Restaurant.models.Booking;
import com.example.restaurant.Restaurant.models.Customer;
import com.example.restaurant.Restaurant.models.Table;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "embedCustomer", types = Booking.class)
public interface EmbedCustomer {
    long getId();
    Date getDate();
    Customer getCustomer();
    Table getTable();
}
