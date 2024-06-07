package com.projectSample.demo.model;

public class ParticipantMedal {
    private String participantName;
    private String medalType; // "Gold", "Silver", or "Bronze"

    public ParticipantMedal() {}

    public ParticipantMedal(String participantName, String medalType) {
        this.participantName = participantName;
        this.medalType = medalType;
    }

    // Getters and Setters
    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getMedalType() {
        return medalType;
    }

    public void setMedalType(String medalType) {
        this.medalType = medalType;
    }
}
