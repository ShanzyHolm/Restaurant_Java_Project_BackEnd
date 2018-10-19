package com.example.restaurant.Restaurant.repositories.customerRepositories;

import com.example.restaurant.Restaurant.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
