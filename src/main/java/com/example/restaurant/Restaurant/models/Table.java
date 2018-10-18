package com.example.restaurant.Restaurant.models;

import javax.persistence.*;
import java.util.List;

@Entity
@javax.persistence.Table(name = "tables")
public class Table {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacity")
    private int capacity;

    @OneToMany(mappedBy = "table", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    public Table(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Table() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
