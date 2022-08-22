package com.patgrady64.countdown.date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/api/v1/date")
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Date> getDates() {
        return dateService.getDates();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public void addNewDate(@RequestBody Date date) {
        dateService.addNewDate(date);
    }
}
