package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private String[] song = {"Remaja","Pelangi","Mata Ke Hati","Orang Ke 3","Kereta Kencan","Satu-Satunya","Siapkah Kau","You Move Me","Lemme Get That","Bye Bye Bye","Lose","Lowkey","New Rules","Don't Start Now","One Kiss","Scared to Be Lonely","Rockabye","Ciao Adios"};
    private String[] songYear = {"2017","2016","2017","2011","2017","2018","2017","2019","2000","2000","2020","2019","2017","2019","2018","2017","2016","2017"};

    private ArrayList<Song> songList;
    private ListView lv_song;
    private SongAdapter songAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_song = findViewById(R.id.lv_song);
        songList = new ArrayList<>();

        for (int i = 0; i <song.length ; i++) {
            Song sng = new Song(song[i],songYear[i]);
            songList.add(sng);
            
        }

        songAdapter = new SongAdapter(this,R.layout.item_row,songList);
        lv_song.setAdapter(songAdapter);
    }
}