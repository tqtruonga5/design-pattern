package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Mp4 player is playing " + fileName);
    }
}
