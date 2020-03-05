package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;


    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker rufin = new Speaker();
        rufin.setFirstName("Rufin");
        rufin.setLastName("Hounkpe");
        rufin.setSeedNum(seedNum);

        System.out.println("calendar: " + calendar.getTime());
        speakers.add(rufin);

        return speakers;
    }
}
