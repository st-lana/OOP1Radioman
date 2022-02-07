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

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int newChannelNumber) {
        if (newChannelNumber > 8) {
            return;
        }
        if (newChannelNumber < 0) {
            return;
        }
        this.channelNumber = newChannelNumber;
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

    public void setCurrentChannel(int newCurrentChannel) {
        if(newCurrentChannel < 0) {
            return;
        }
        if(newCurrentChannel > 9) {
            return;
        }
        this.currentChannel = newCurrentChannel;
    }

    public void increaseVolume1point() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume1point() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void putNextChannel() {
        currentChannel++;
        if (currentChannel > 9) {
            currentChannel = 0;
        }



    }

    public void putPreviousChannel() {
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = 9;
        }

    }















}