package com.patgrady64.countdown.date;


import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
// import java.util.Optional;

@Service
public class DateService {

    private final DateRepository dateRepository;

    public DateService(DateRepository dateRepository) {
        this.dateRepository = dateRepository;
    }

    public List<Date> getDates() {
        List<Date> d = dateRepository.findAll();

        if (d.size() > 0) Collections.sort(d);
        return d;
    }

    public void addNewDate(Date date) {
        // TODO: Add Validation so there is no duplicate dates

        dateRepository.save(date);
        System.out.println(date.getDate());
    }
}
