package com.projectSample.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "my_board")
public class MyBoard {

    @Id
    private String countryId;
    private String countryName;
    private int totalNoOfMedals;
    private int noOfParticipants;
    private List<ParticipantMedal> participantsMedals;

    // Constructor
    public MyBoard() {}

    public MyBoard(String countryId, String countryName, int noOfParticipants) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.noOfParticipants = noOfParticipants;
        this.totalNoOfMedals = 0;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getTotalNoOfMedals() {
        return totalNoOfMedals;
    }

    public void setTotalNoOfMedals(int totalNoOfMedals) {
        this.totalNoOfMedals = totalNoOfMedals;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public List<ParticipantMedal> getParticipantsMedals() {
        return participantsMedals;
    }

    public void setParticipantsMedals(List<ParticipantMedal> participantsMedals) {
        this.participantsMedals = participantsMedals;
        this.totalNoOfMedals = participantsMedals.size();
    }
}
