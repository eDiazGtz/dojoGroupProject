package com.codingdojo.bookIt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.bookIt.models.BookingCalendar;


@Repository
public interface BookingCalendarRepository extends CrudRepository<BookingCalendar, Long> {

}
