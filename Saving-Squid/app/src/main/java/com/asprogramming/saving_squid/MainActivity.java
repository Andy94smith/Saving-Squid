package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class MainActivity extends Activity {

    private Button menu_kid_button;
    private Button menu_parent_button;

    static boolean request_job = false;
    static boolean job_accepted = false;
    static boolean all_done = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_kid_button = (Button) findViewById(R.id.menu_kids_button);
        menu_kid_button.setVisibility(VISIBLE);
        menu_kid_button.setBackgroundColor(Color.TRANSPARENT);

        menu_kid_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Kid_Login.class));
            }
        });

        menu_parent_button = (Button) findViewById(R.id.menu_parent_button);
        menu_parent_button.setVisibility(VISIBLE);
        menu_parent_button.setBackgroundColor(Color.TRANSPARENT);

        menu_parent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Parent_Login.class));
            }
        });

    }
}
