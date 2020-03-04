package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker rufin = new Speaker();
        rufin.setFirstName("Rufin");
        rufin.setLastName("Hounkpe");

        speakers.add(rufin);

        return speakers;
    }
}
