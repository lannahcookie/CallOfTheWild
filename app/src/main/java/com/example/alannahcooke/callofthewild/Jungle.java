package com.example.alannahcooke.callofthewild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alannahcooke on 17/08/16.
 */
public class Jungle extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_jungle);

        Button elephant = (Button) findViewById(R.id.elephantButton);
        Button tiger = (Button) findViewById(R.id.tigerButton);
        Button monkey = (Button) findViewById(R.id.monkeyButton);

        elephant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Jungle.this, pop_elephant.class));
            }
        });

        tiger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Jungle.this, pop_tiger.class));
            }
        });

        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Jungle.this, pop_monkey.class));

            }
        });




    }
}

