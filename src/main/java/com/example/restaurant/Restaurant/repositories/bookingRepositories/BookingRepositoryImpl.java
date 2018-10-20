package com.example.restaurant.Restaurant.repositories.bookingRepositories;

import com.example.restaurant.Restaurant.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BookingRepositoryImpl  implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getAllBookingsForDate(String date){
        Date bookingDate = null;
        DateFormat df = new SimpleDateFormat("dd-MM-yy");
        try {
            bookingDate = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Booking> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", bookingDate));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;

    }
}
