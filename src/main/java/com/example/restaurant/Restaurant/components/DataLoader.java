package com.example.restaurant.Restaurant.components;

import com.example.restaurant.Restaurant.models.Booking;
import com.example.restaurant.Restaurant.models.Customer;
import com.example.restaurant.Restaurant.models.Table;
import com.example.restaurant.Restaurant.repositories.bookingRepositories.BookingRepository;
import com.example.restaurant.Restaurant.repositories.customerRepositories.CustomerRepository;
import com.example.restaurant.Restaurant.repositories.tableRepositories.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    TableRepository tableRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        String newDate = "24-12-18";
        Date date = null;
        try {
            date =df.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Customer customer1 = new Customer("Customer1", "123");
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Customer2", "123");
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Customer3", "123");
        customerRepository.save(customer3);

        Table table1 = new Table("Table1", 4);
        tableRepository.save(table1);

        Table table2 = new Table("Table2", 4);
        tableRepository.save(table2);

        Table table3 = new Table("Table3", 4);
        tableRepository.save(table3);

        Table table4 = new Table("Table4", 4);
        tableRepository.save(table4);

        Booking booking1 = new Booking(date, customer1, table1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking(date, customer1, table2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking(date, customer2, table3);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking(date, customer3, table1);
        bookingRepository.save(booking4);

        Booking booking5 = new Booking(date, customer3, table2);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking(date, customer3, table3);
        bookingRepository.save(booking6);

        Booking booking7 = new Booking(date, customer3, table4);
        bookingRepository.save(booking7);
    }
}
