package com.example.alannahcooke.callofthewild;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by alannahcooke on 17/08/16.
 */
public class Desert extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);

        Button snake = (Button) findViewById(R.id.snakeButton);
        Button camel = (Button) findViewById(R.id.camelButton);

        snake.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Desert.this, pop_snake.class));
            }
        });

        camel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Desert.this, pop_camel.class));
            }
        });
    }
}
