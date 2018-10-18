package com.example.restaurant.Restaurant.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="table_id", nullable=false)
    private Table table;

    public Booking(Date date, Customer customer, Table table) {
        this.date = date;
        this.customer = customer;
        this.table = table;
    }

    public Booking() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public com.example.restaurant.Restaurant.models.Table getTable() {
        return table;
    }

    public void setTable(com.example.restaurant.Restaurant.models.Table table) {
        this.table = table;
    }
}
