package com.example.thigiuaki305;

import android.widget.ImageView;

public class ListMusic {
    private String Song;
    private String Voider;
    private int ImgSong;

    public ListMusic(String song, String voider,int imgSong) {
        Song = song;
        Voider = voider;
        ImgSong = imgSong;
    }

    public int getImgSong() {
        return ImgSong;
    }

    public void setImgSong(int imgSong) {
        ImgSong = imgSong;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }

    public String getVoider() {
        return Voider;
    }

    public void setVoider(String voider) {
        Voider = voider;
    }
}
