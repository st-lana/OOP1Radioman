package ru.netology.domain;

public class Radio {
    private int channelNumber = 10;
    private int currentChannel;
    private int currentVolume;

    public Radio() {
    }
    public Radio(int channelNumber, int currentChannel, int currentVolume) {
        this.channelNumber = channelNumber;
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if(currentVolume > 99) {
            return;
        }
        if(currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentChannel(int CurrentChannel) {
        if(currentChannel < 0) {
            return;
        }
        if(currentChannel > 9) {
            return;
        }
        this.currentChannel = currentChannel;
    }













}