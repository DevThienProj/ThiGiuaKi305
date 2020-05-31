package com.example.thigiuaki305;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class PlayListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ListMusic> listMusics;
    private PlayListSongAdapter playListSongAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        recyclerView = findViewById(R.id.lvList);
        listMusics = new ArrayList<>();
        createListSong();
        playListSongAdapter = new PlayListSongAdapter(this, listMusics);
        recyclerView.setAdapter(playListSongAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void createListSong() {
        listMusics.add(new ListMusic("Bang Bang Bang","Yoon A",R.drawable.hinhnengiuaki));





    }
}
