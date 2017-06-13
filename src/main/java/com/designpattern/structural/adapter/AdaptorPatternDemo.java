package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public class AdaptorPatternDemo {
    public static void main(String[] args) throws Exception {
        MediaPlayer player = new AudioPlayer();
        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("vlc", "far far away.vlc");
        player.play("avi", "mind me.avi");
    }
}
