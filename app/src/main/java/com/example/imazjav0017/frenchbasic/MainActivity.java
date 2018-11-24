package com.example.imazjav0017.frenchbasic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void translate(View v)
    {
        int id=v.getId();
        String ourId="";
        ourId=v.getResources().getResourceEntryName(id);
        int rId=getResources().getIdentifier(ourId,"raw",getPackageName());
        MediaPlayer mplayer= MediaPlayer.create(this,rId);
        mplayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
