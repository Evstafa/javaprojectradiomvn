package ru.netology.javaprojectradiomvn;

public class Radio {
    private int numberCurrentRadioStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 10;
        this.maxStation = maxStation;
    }

    public Radio(int StationCount) {
        this.maxStation = StationCount - 1;
    }

    public void next() {
        if (numberCurrentRadioStation != 9) {
            numberCurrentRadioStation++;
        } else {
            numberCurrentRadioStation = 0;
        }
    }

    public void prev() {
        if (numberCurrentRadioStation != 0) {
            numberCurrentRadioStation++;
        } else {
            numberCurrentRadioStation = 9;
        }
    }

    public int getNumberCurrentRadioStation() {
        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation < 0) {
            return;
        }
        if (numberCurrentRadioStation > maxStation) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }
}