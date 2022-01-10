package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldIncreaseVolumePositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume1point();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeNegativeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume1point();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumePositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume1point();

        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void shouldDecreaseVolumeNegativeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume1point();

        assertEquals(0, radio.getCurrentVolume());

    }


    @Test
    public void shouldSetVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeToMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        assertEquals(0, radio.getCurrentVolume());


    }



    @Test
    public void shouldSetVolumePositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);


        assertEquals(1, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);


        assertEquals(10, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);


        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeMedianPositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);


        assertEquals(5, radio.getCurrentVolume());


    }

    @Test
    public void shouldChangeChannelUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);

        assertEquals(0, radio.getCurrentChannel());

    }
    @Test
    public void shouldChangeChannelToMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        assertEquals(0, radio.getCurrentChannel());

    }
    @Test
    public void shouldChangeChannelPositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);

        assertEquals(5, radio.getCurrentChannel());

    }
    @Test
    public void shouldChangeChannelToMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);

        assertEquals(9, radio.getCurrentChannel());

    }
    @Test
    public void shouldChangeChannelOverMax() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);

        assertEquals(9, radio.getCurrentChannel());

    }

   @Test
    public void shouldPutNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(8);
        radio.putNextChannel();
        assertEquals(9, radio.getCurrentChannel());
   }

    @Test
    public void shouldPutNextChannelOnMaxPosition() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.putNextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPutPrevChannePositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(1);
        radio.putPreviousChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPutPrevChanneNegativeTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.putPreviousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }



}


