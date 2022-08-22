package com.patgrady64.countdown.date;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DateService {

    private final DateRepository dateRepository;

    public DateService(DateRepository dateRepository) {
        this.dateRepository = dateRepository;
    }

    public List<Date> getDates() {
        return dateRepository.findAll();
    }

    public void addNewDate(Date date) {
        // Add Validation

        dateRepository.save(date);
        System.out.println(date.getDate());
    }
}
