package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;
    private int maxChannel;
    private int minChannel;
    private int maxVolume;
    private int minVolume;

    public int increaseVolume(int[] volumePositions) {
        int currentVolume = volumePositions[0];
        for (int volumePosition : volumePositions) {
            if (currentVolume < 10) {
                currentVolume++;
            } else {
                currentVolume = 10;
            }
        }
        return currentVolume;
    }


    public int decreaseVolume(int[] volumePositions) {
        int currentVolume = volumePositions[0];
        for (int volumePosition : volumePositions) {
            if (currentVolume > 0) {
                currentVolume--;
            } else {
                currentVolume = 0;
            }


        }
        return currentVolume;
    }

    public int makeNextChannel(int[] channelPositions) {
        int currentChannel = channelPositions[0];
        for (int channelPosition : channelPositions) {
            if (currentChannel < 9) {
                currentChannel++;
            } else {
                currentChannel = 1;

            }
        }
        return currentChannel;

    }

    public int makePreviousChannel(int[] channelPositions) {
        int currentChannel = channelPositions[0];
        for (int channelPosition : channelPositions) {
            if (channelPosition > 1) {
                currentChannel--;
            } else {
                currentChannel = 9;
            }
        }
        return currentChannel;

    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



    public void setMaxChannel(int maxChannel) {
        this.maxChannel = maxChannel;
    }



    public void setMinChannel(int minChannel) {
        this.minChannel = minChannel;
    }



    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}