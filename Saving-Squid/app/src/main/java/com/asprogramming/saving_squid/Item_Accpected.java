package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Item_Accpected extends AppCompatActivity {

    Button accept_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__accpected);

        accept_button = (Button) findViewById(R.id.accept_button);
        accept_button.setVisibility(VISIBLE);
        accept_button.setBackgroundColor(Color.TRANSPARENT);

        accept_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), Kids_Menu.class));
            }
        });

    }
}
