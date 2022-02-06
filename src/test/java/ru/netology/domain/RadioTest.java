package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldGetCurrentChannel() {
        Radio radio = new Radio(9, 8, 88);

        assertEquals(5, radio.getCurrentChannel());
    }

    @Test

    public void shouldGetCurrentVolume() {
        Radio radio = new Radio(9, 8, 88);

        assertEquals(80, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumePositiveTest() {
        Radio radio = new Radio(9, 8, 111);
         assertEquals(0, radio.getCurrentVolume());



    }

    @Test

    public void shouldSetChannelPositiveTest() {
        Radio radio = new Radio(9, 8, 88);
        radio.setCurrentChannel(7);

        assertEquals(7, radio.getCurrentChannel());
    }

    @Test

    public void shouldSetChannelOverMax() {
        Radio radio = new Radio(9, 8, 88);
        radio.setCurrentChannel(7);
        radio.setCurrentChannel(10);

        assertEquals(7, radio.getCurrentChannel());

    }

    @Test

    public void shouldSetChannelUnderMin() {
        Radio radio = new Radio(9, 8, 88);


        assertEquals(7, radio.getCurrentChannel());

    }







}


