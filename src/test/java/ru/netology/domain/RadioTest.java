package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(8);
        assertEquals(8, radio.getChannelNumber());
    }


    @Test
    public void shouldCheckDefaultChannelNumber() {
        Radio radio = new Radio();
        assertEquals(10, radio.getChannelNumber());
    }

    @Test
    public void shouldIncreaseVolumePositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume1point();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume1point();
        int expected = 99;
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
    void shouldDecreaseVolumeUnderMin() {
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
        radio.setCurrentVolume(99);


        assertEquals(99, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);


        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetVolumeMedianPositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(60);
        assertEquals(60, radio.getCurrentVolume());


    }

    @Test
    public void shouldSetChannelUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);

        assertEquals(0, radio.getCurrentChannel());

    }

    @Test
    public void shouldSetChannelUnderMinForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(-1);
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannelPositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(6);
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannelForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(6);
        assertEquals(6, radio.getCurrentChannel());
    }


    @Test
    public void shouldSetChannelToMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);

        assertEquals(0, radio.getCurrentChannel());

    }

    @Test
    public void shouldSetChannelOverMaxForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(9);

        assertEquals(7, radio.getCurrentChannel());

    }

    @Test
    public void shouldSetChannelToMax() {
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
    public void shouldSetToNextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(7);
        radio.putNextChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetToNextChannelForConstructor() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.putNextChannel();
        assertEquals(6, radio.getCurrentChannel());

    }

    @Test
    public void shouldSetToNextChannelOnMaxPosition() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.putNextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetNextOnMaxForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(7);
        radio.putNextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPutPrevChannelPositiveTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(1);
        radio.putPreviousChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannelForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(4);
        radio.putPreviousChannel();
        assertEquals(3, radio.getCurrentChannel());
    }

    @Test
    public void shouldPutPrevChannelFromMin() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.putPreviousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void shouldPutPrevChannelFromMinForConstructor() {
        Radio radio = new Radio(8);
        radio.setCurrentChannel(0);
        radio.putPreviousChannel();
        assertEquals(7, radio.getCurrentChannel());
    }

}


