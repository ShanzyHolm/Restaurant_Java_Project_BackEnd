package com.example.restaurant.Restaurant.repositories.tableRepositories;

import com.example.restaurant.Restaurant.models.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<Table, Long> {
}
