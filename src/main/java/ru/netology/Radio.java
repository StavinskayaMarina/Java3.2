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

}