package com.patgrady64.countdown.date;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "date", schema = "public")
public class Date {
    @Id
//    @SequenceGenerator(
//            name="date-sequence",
//            sequenceName = "date-sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "date-sequence"
//    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date(int id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public Date(LocalDate date) {
        this.date = date;
    }

    public Date() {
        this.date = LocalDate.now();
    }
}
