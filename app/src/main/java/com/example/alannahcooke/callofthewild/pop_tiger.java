package com.example.alannahcooke.callofthewild;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by alannahcooke on 17/08/16.
 */
public class pop_tiger extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_tiger);

        final MediaPlayer tigerSound = MediaPlayer.create(this, R.raw.tiger);

        Button playTigerRoar = (Button) this.findViewById(R.id.audioTiger);

        playTigerRoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tigerSound.start();
            }
        });

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));


    }
}
