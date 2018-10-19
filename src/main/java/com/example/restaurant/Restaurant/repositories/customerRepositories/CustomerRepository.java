package com.example.restaurant.Restaurant.repositories.customerRepositories;

import com.example.restaurant.Restaurant.models.Customer;
import com.example.restaurant.Restaurant.projections.EmbedBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedBookings.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
