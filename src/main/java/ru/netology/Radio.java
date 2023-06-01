package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int radioStationNumber;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentStation;
    private int soundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentSoundVolume;
    private int NextStation;
    private int PrevStation;
    private int TurnUpVolume;
    private int TurnDownVolume;

    public void setNextStation() {
        if (currentStation < maxStationNumber) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStationNumber;
        }
    }

    public void setPrevStation() {
        if (currentStation > minStationNumber) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStationNumber;
        }
    }

    public void setTurnUpVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void setTurnDownVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

}