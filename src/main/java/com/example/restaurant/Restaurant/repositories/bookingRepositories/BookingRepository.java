package com.example.restaurant.Restaurant.repositories.bookingRepositories;

import com.example.restaurant.Restaurant.models.Booking;
import com.example.restaurant.Restaurant.projections.EmbedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
@RepositoryRestResource(excerptProjection = EmbedCustomer.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
