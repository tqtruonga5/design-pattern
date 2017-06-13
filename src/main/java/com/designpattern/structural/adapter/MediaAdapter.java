package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType) {
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.play(fileName);
    }
}
