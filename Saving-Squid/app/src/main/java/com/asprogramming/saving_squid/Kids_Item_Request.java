package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Kids_Item_Request extends AppCompatActivity {

    Button job_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids__item__request);

        job_button = (Button) findViewById(R.id.job_button);
        job_button.setVisibility(VISIBLE);
        job_button.setBackgroundColor(Color.TRANSPARENT);

        job_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Waiting_On_Parent.class));
            }
        });
    }
}
