package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;



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



    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
//
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < 0) {
            return;
        }
        if (currentChannel > 9) {
            currentChannel = 9;
        }
        this.currentChannel = currentChannel;
    }

    public void putNextChannel() {
        if (currentChannel <= 9) {
            currentChannel++;
            if (currentChannel > 9) {
                currentChannel = 0;
            }

        }

    }

    public void putPreviousChannel() {
        currentChannel--;
        if (currentChannel < 0) {
            currentChannel = 9;
        }

    }


}