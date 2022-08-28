package com.patgrady64.countdown.date;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;


import java.util.List;


@RestController
@RequestMapping(path="/api/v1/date")
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping
    @CrossOrigin("*")
    public List<Date> getDates() {
        return dateService.getDates();
    }

    @PostMapping
    @CrossOrigin("*")
    public void addNewDate(@RequestBody Date date) {
        dateService.addNewDate(date);
    }

    @DeleteMapping(value = "/{id}")
    @CrossOrigin("*")
    public void deletePByID(@PathVariable Long id) {
        dateService.deleteDate(id);
        System.out.println(dateService.getDates());
    }
}
