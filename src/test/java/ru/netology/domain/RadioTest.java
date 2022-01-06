package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        int[] volumeUpPositions = {0,1,2,3,4,5,6,7,8,9,10};


        assertEquals(10, radio.increaseVolume(volumeUpPositions));

    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        int[] volumeDownPositions = {10,9,8,7,6,5,4,3,2,1,0,-1};

        assertEquals(0, radio.decreaseVolume(volumeDownPositions));
    }

    @Test
    void shouldMakeNextChannel() {
        Radio radio = new Radio();
        int[] nextChannel = {1,2,3,4,5,6,7,8,9};

        assertEquals(1, radio.makeNextChannel(nextChannel));
    }

    @Test
    void shouldMakePreviousChannel() {
        Radio radio = new Radio();
        int[] previousChannel = {9,8,7,6,5,4,3,2,1};
        assertEquals(9, radio.makePreviousChannel(previousChannel));
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-10);
        radio.setCurrentVolume(10);
        radio.setCurrentVolume(13);

        assertEquals(10, radio.getCurrentVolume());


    }

    @Test
    public void shouldChangeChannel() {
        Radio radio = new Radio();

        radio.setMinChannel(1);
        radio.setMaxChannel(9);
        radio.setCurrentChannel(0);
        radio.setCurrentChannel(1);
        radio.setCurrentChannel(9);
        radio.setCurrentChannel(10);

        assertEquals(9, radio.getCurrentChannel());

    }


}


