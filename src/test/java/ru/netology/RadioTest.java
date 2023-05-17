package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void switchToNextStationFromMin () {
       Radio radio = new Radio();
        radio.setNextStation();

        int expected = 1;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void switchToNextStationFromMax () {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.setNextStation();

        int expected = 0;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void switchToNextStationFromMiddle () {
        Radio radio = new Radio();
        radio.currentStation = 5;
        radio.setNextStation();

        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationFromMiddle () {
        Radio radio = new Radio();
        radio.currentStation = 7;
        radio.setPrevStation();

        int expected = 6;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void switchToPrevStationFromMin () {
        Radio radio = new Radio();
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void switchToPrevStationFromMax () {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void correctStationValue () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void enterStationMore () {
        Radio radio = new Radio();
        radio.setCurrentStation(13);

        int expected = radio.currentStation;;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void stationInputLess () {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int expected = radio.currentStation;;
        int actual = radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
}
