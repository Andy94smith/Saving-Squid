package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Item_Pricing extends AppCompatActivity {

    private Button price_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__pricing);

        MainActivity.all_done = true;

        price_button = (Button) findViewById(R.id.price_button);
        price_button.setVisibility(VISIBLE);
        price_button.setBackgroundColor(Color.TRANSPARENT);

        price_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Parent_Menu.class));
            }
        });

    }
}
