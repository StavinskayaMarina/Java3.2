package ru.netology;

public class Radio {

    private int radioStationNumber;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentStation;
    private int soundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentSoundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

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

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStationNumber) {
            return;
        }
        if (newCurrentStation > maxStationNumber) {
            return;
        }
        currentStation = newCurrentStation;
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

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minSoundVolume) {
            return;
        }
        if (newCurrentSoundVolume > maxSoundVolume) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

}
