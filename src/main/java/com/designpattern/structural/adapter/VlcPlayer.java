package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("VLC player is playing " + fileName);
    }

}
