package com.example.bookingservice.service;

import com.example.bookingservice.Exceptions.BookingNotFoundException;
import com.example.bookingservice.Exceptions.DuplicateBookingException;
import com.example.bookingservice.model.Booking;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.service;




public class Bookingservice {
    private final List<Booking> bookings; = new ArrayList();
    public List<Booking> getAll() {return bookings;}
    public Booking getByCode (String code) {
        for (Booking booking : bookings) {
            if(booking.getBookingCode().equals(code))
                throw new BookingNotFoundException("Not Found" + code);

        }
        public Booking add(Booking booking){
            for(Booking existing : bookings){
                if(existing.getBookingCode().equals(booking.getBookingCode());
                throw new DuplicateBookingException("Exists" + booking.getBookingCode()); existing.setDays(updatedDays());
                return e;
            }
            public void delete(String code){bookings.remove(getByCode(code));


        }


}
