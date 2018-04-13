package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Waiting_On_Parent extends AppCompatActivity {

    private Button waiting_on_parent_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiting__on__parent);

        waiting_on_parent_btn = (Button) findViewById(R.id.waiting_on_parent_btn);
        waiting_on_parent_btn.setVisibility(VISIBLE);
        waiting_on_parent_btn.setBackgroundColor(Color.TRANSPARENT);

        waiting_on_parent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.request_job = true;
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}
