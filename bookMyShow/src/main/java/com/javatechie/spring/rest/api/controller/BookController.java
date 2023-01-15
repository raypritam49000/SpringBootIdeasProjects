package com.javatechie.spring.rest.api.controller;

import com.javatechie.spring.rest.api.model.BookRequest;
import com.javatechie.spring.rest.api.repository.BookMyShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BookMyShow/Service")
public class BookController {
    @Autowired
    private BookMyShowRepository repository;

    @PostMapping("/bookingShow")
    public String bookShow(@RequestBody BookRequest bookRequest) {
        BookRequest response = repository.save(bookRequest);
        return "Hi " + response.getUserName() + " your Request for " + response.getShowName() + " on date "
                + response.getBookingTime() + "Booking successfully..";
    }

    @GetMapping("/getAllBooking")
    public List<BookRequest> getAllBooking() {
        return repository.findAll();
    }

    @GetMapping("/getBooking/{bookingId}")
    public BookRequest getBooking(@PathVariable int bookingId) {
        return repository.findById(bookingId).get();
    }

    @DeleteMapping("/cancelBooking/{bookingId}")
    public String cancelBooking(@PathVariable int bookingId) {
        repository.deleteById(bookingId);
        return "Booking cancelled with bookingId : " + bookingId;
    }

    @PutMapping("/updateBooking/{bookingId}")
    public BookRequest updateBooking(@RequestBody BookRequest updateBookRequest, @PathVariable int bookingId) {
        BookRequest dbResponse = repository.findById(bookingId).get();
        dbResponse.setBookingTime(updateBookRequest.getBookingTime());
        dbResponse.setPrice(updateBookRequest.getPrice());
        dbResponse.setShowName(updateBookRequest.getShowName());
        dbResponse.setUserCount(updateBookRequest.getUserCount());
        repository.saveAndFlush(dbResponse);
        return dbResponse;
    }
}
