package ru.netology.javaprojectradiomvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberCurrentRadioStation() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(9);
        int expected = 9;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(6);
        int expected = 6;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev() {
        Radio number = new Radio();
        number.setNumberCurrentRadioStation(9);
        int expected = 9;
        int actual = number.getNumberCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume() {
        Radio number = new Radio();
        number.setCurrentVolume(1);
        int expected = 1;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio number = new Radio();
        number.setCurrentVolume(3);
        int expected = 3;
        int actual = number.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

