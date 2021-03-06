package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Kids_job_list extends Activity {

    private Button job_list_button;
    private Button kid_menu__button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_job_list);

        job_list_button = (Button) findViewById(R.id.job_list_button);
        job_list_button.setVisibility(VISIBLE);
        job_list_button.setBackgroundColor(Color.TRANSPARENT);

        job_list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Chore_Complete.class));
            }
        });

        kid_menu__button = (Button) findViewById(R.id.kid_menu__button);
        kid_menu__button.setVisibility(VISIBLE);
        kid_menu__button.setBackgroundColor(Color.TRANSPARENT);

        kid_menu__button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Kids_Menu.class));
            }
        });



    }
}
