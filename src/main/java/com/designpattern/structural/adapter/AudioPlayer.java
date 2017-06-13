package com.designpattern.structural.adapter;

/**
 * Created by truong on 12/06/2017.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) throws Exception {
        switch (audioType) {
            case "mp4":
            case "vlc":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            case "mp3":
                System.out.println("playing mp3 file.");
                break;
            default:
                throw new Exception("file type " + audioType + " is not supported.");
        }
    }
}
