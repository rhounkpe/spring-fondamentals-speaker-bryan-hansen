package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker rufin = new Speaker();
        rufin.setFirstName("Rufin");
        rufin.setLastName("Hounkpe");

        System.out.println("calendar: " + calendar.getTime());
        speakers.add(rufin);

        return speakers;
    }
}
