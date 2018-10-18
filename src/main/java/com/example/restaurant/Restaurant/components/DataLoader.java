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

       Customer customer = new Customer("Jobby", "123");
       customerRepository.save(customer);

       Table table = new Table("jobbytable", 4);
       tableRepository.save(table);

       Booking booking = new Booking(date, customer, table);
       bookingRepository.save(booking);
    }
}
