package com.patgrady64.countdown.date;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

// import java.util.Optional;

public interface DateRepository extends JpaRepository<Date, Long> {

//    @Query("SELECT d from DATE d WHERE d.date=?1")
//    Optional<Date> findDateByid();
}
