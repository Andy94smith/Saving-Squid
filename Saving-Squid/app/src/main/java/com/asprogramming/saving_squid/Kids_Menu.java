package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Kids_Menu extends Activity {

    private Button job_list_button;
    private Button kid_logout_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids__menu);

        job_list_button = (Button) findViewById(R.id.job_list_button);
        job_list_button.setVisibility(VISIBLE);
        job_list_button.setBackgroundColor(Color.TRANSPARENT);

        job_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Kids_job_list.class));
            }
        });

        kid_logout_button = (Button) findViewById(R.id.kid_logout_button);
        kid_logout_button.setVisibility(VISIBLE);
        kid_logout_button.setBackgroundColor(Color.TRANSPARENT);

        kid_logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
