package com.patgrady64.countdown.date;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class DateService {

    private final DateRepository dateRepository;

    public DateService(DateRepository dateRepository) {
        this.dateRepository = dateRepository;
    }

    private void printDates(List<Date> dates) {
        for (Date date : dates) {
            System.out.println(date.getDate());
        }
    }

    public List<Date> getDates() {
        List<Date> dates = dateRepository.findAll();
        printDates(dates);

        if (dates.size() > 0) Collections.sort(dates);
        return dates;
    }

    public Optional<Date> getDate(Long id) {
        Optional<Date> date = dateRepository.findById(id);
        return date;
    }

    public void addNewDate(Date date) {

        dateRepository.save(date);
        System.out.println(date.getDate());
    }

    // public boolean deleteDate(Long id) {

    //     if (getDate(id)) {

    //     }
    //     // boolean isRemoved = this.dateRepository.delete()
    //     // removeIf(date -> date.getId().equals(id));

    //     System.out.println(this.getDates());
    //     return isRemoved;
    // }

    public void deleteDate(Long id) {
        dateRepository.deleteById(id);
        System.out.println(getDates());
    }
}
