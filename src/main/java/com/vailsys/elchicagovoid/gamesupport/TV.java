package com.vailsys.elchicagovoid.gamesupport;

import java.text.MessageFormat;

public class TV {
    public int size;
    private int power;
    public int channel;
    private int maxChannel;

    public TV(int inches, int wattage) {
        size = inches;
        power = wattage;
        // my favorite number is 8 so every TV will start on this channel
        channel = 8;
        maxChannel = 60;
        Object[] params = new Object[]{size, power};
        String msg = MessageFormat.format("the size of the new tv is {0} inches and its power is {1} watts", params);
        System.out.println(msg);
    }

    public void changeChannelUp() {
        if (channel == maxChannel) {
            channel = 1;
        } else {
            channel = channel + 1;
        }
        System.out.println("the TV changed the channel to " + channel);
    }

    public void changeChannelDown() {
        if (channel == 1) {
            channel = maxChannel;
        } else {
            channel = channel - 1;
        }
        System.out.println("the TV changed the channel to " + channel);
    }

    public void changeChannel(int channelNumber) {
        channel = channelNumber;
        System.out.println("the TV changed the channel to " + channel);
    }

    public static void main(String[] args) {
        TV bedroomTV = new TV(60, 100);
        System.out.println("The TV is on and set to channel " + bedroomTV.channel);
        bedroomTV.changeChannelUp(); // change 9
        bedroomTV.changeChannelUp(); // change 10
        bedroomTV.changeChannelDown(); // change 9
        bedroomTV.changeChannel(17); // change 17
    }
}