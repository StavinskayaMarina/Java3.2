package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // Тесты станций
    @Test
    void callingСNumber() {
        Radio radio = new Radio();
        radio.getRadioStationNumber();

        int expected = radio.getRadioStationNumber();
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callingCurrentStation() {
        Radio radio = new Radio();
        radio.getCurrentStation();

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callMinStation() {
        Radio radio = new Radio();
        radio.getMinStationNumber();

        int expected = radio.getMinStationNumber();
        int actual = radio.getMinStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callMaxStation() {
        Radio radio = new Radio();
        radio.getMaxStationNumber();

        int expected = radio.getMaxStationNumber();
        int actual = radio.getMaxStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationFromMin() {
        Radio radio = new Radio();
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void switchToPrevStationFromMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setPrevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationFromMin() {
        Radio radio = new Radio();
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void correctStationValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void enterStationAbove() {
        Radio radio = new Radio();
        radio.setCurrentStation(13);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputLess() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты звука
    @Test
    void callingSoundVolume() {
        Radio radio = new Radio();
        radio.getSoundVolume();

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callingCurrentSoundVolume() {
        Radio radio = new Radio();
        radio.getCurrentSoundVolume();

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callMinSoundVolume() {
        Radio radio = new Radio();
        radio.getMinSoundVolume();

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void callMaxSoundVolume() {
        Radio radio = new Radio();
        radio.getMaxSoundVolume();

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void raiseVolumeFromMin() {
        Radio radio = new Radio();
        radio.setTurnUpVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void raiseVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.setTurnUpVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lowerVolumeFromMin() {
        Radio radio = new Radio();
        radio.setTurnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lowerVolumeFromMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.setTurnDownVolume();

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void correctSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(64);

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundMoreValue() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(113);

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundLessValues() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-7);

        int expected = radio.getCurrentSoundVolume();
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}
