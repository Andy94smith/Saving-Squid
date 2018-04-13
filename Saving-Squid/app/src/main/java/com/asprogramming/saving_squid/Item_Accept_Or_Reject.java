package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Item_Accept_Or_Reject extends AppCompatActivity {

    Button item_accept_btn;
    Button item_reject_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__accept__or__reject);

        item_accept_btn = (Button) findViewById(R.id.item_accept_btn);
        item_accept_btn.setVisibility(VISIBLE);
        item_accept_btn.setBackgroundColor(Color.TRANSPARENT);

        item_reject_btn = (Button) findViewById(R.id.item_reject_btn);
        item_reject_btn.setVisibility(VISIBLE);
        item_reject_btn.setBackgroundColor(Color.TRANSPARENT);

        item_accept_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.job_accepted = true;
                startActivity(new Intent(getApplicationContext(), Item_Pricing.class));


            }
        });

        item_reject_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), Kids_Item_Request.class));

            }
        });

    }
}
