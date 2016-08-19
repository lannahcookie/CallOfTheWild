package com.example.alannahcooke.callofthewild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by alannahcooke on 17/08/16.
 */
public class Farm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm);

        ImageButton cat = (ImageButton) findViewById(R.id.catpic);
        ImageButton chicken = (ImageButton) findViewById(R.id.chickenpic);
        ImageButton cow = (ImageButton) findViewById(R.id.cow);

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Farm.this, pop_chicken.class));
            }
        });

        cow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Farm.this, pop_cow.class));
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Farm.this, pop_cat.class));
            }
        });


    }
}
