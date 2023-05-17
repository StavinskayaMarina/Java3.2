public class Radio {
    public int radioStationNumber;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentStation;

    public int getCurrentStation () {
        return currentStation;
    }
    public int getMinStationNumber () {
        return minStationNumber;
    }
    public int getMaxStationNumber () {
        return maxStationNumber;
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
    public void setCurrentStation (int newCurrentStation) {
        if (newCurrentStation < minStationNumber) {
            return;
        }
        if (newCurrentStation > maxStationNumber) {
            return;
        }
        currentStation = newCurrentStation;
    }



    public int soundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int currentSoundVolume;

    public int getCurrentSoundVolume () {
        return currentSoundVolume;
    }

    public int getMinSoundVolume () {
        return minSoundVolume;
    }

    public int getMaxSoundVolume () {
        return maxSoundVolume;
    }
    public void setCurrentSoundVolume (int currentSoundVolume) {
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
    }


}
