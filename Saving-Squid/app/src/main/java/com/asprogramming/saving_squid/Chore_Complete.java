package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Chore_Complete extends AppCompatActivity {

    private Button complete_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chore__complete);

        complete_button = (Button) findViewById(R.id.complete_button);
        complete_button.setVisibility(VISIBLE);
        complete_button.setBackgroundColor(Color.TRANSPARENT);

        complete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Kids_job_list.class));
            }
        });

    }
}
