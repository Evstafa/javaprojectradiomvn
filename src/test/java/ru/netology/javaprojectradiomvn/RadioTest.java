package ru.netology.javaprojectradiomvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberCurrentRadioStationBoundary() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(-6);
        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberCurrentRadioStationBorderM() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(9);
        int expected = 9;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberCurrentRadioStationBorder() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(-1);
        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberCurrentRadioStationMax() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(16);
        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(5);

        number.next();

        int expected = 6;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBorderOne() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(1);

        number.next();

        int expected = 2;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBorderTwo() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(0);

        number.next();

        int expected = 1;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTree() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(9);

        number.next();

        int expected = 0;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(6);

        number.prev();

        int expected = 7;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTwo() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(0);

        number.prev();

        int expected = 9;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeBorderMin() {
        Radio number = new Radio();
        number.setCurrentVolume(1);
        int expected = 1;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeBorderOne() {
        Radio number = new Radio();
        number.setCurrentVolume(18);
        int expected = 0;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeBorderTwo() {
        Radio number = new Radio();
        number.setCurrentVolume(-6);
        int expected = 0;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio number = new Radio();
        number.setCurrentVolume(10);
        int expected = 10;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMin() {
        Radio number = new Radio();
        number.setCurrentVolume(0);
        int expected = 0;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBorder() {
        Radio number = new Radio();
        number.setCurrentVolume(3);

        number.increaseVolume();

        int expected = 4;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}

