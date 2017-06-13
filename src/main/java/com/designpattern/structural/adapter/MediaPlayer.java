package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public interface MediaPlayer {
    void play(String audioType, String fileName) throws Exception;
}