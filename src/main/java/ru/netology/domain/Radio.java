package ru.netology.domain;

public class Radio {

    private int channelNumber = 10;
    private int currentChannel;
    private int currentVolume;


    public Radio() {
    }

    public Radio(int channelNumber) {
        this.channelNumber = channelNumber;
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


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 99) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        int maxChannel = channelNumber - 1;
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > maxChannel) {
            newCurrentChannel = maxChannel;
        }
        this.currentChannel = newCurrentChannel;

    }

    public void increaseVolume1point() {
        if (currentVolume < 99) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume1point() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void putNextChannel() {
        int maxChannel = channelNumber - 1;
        currentChannel++;
        if (currentChannel > maxChannel) {
            currentChannel = 0;

        }


    }

    public void putPreviousChannel() {
        int maxChannel = channelNumber - 1;
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = maxChannel;
        }

    }

}