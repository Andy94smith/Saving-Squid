package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Parent_Menu extends Activity {

    private Button set_chore_button;
    private Button check_chore_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent__menu);

        set_chore_button = (Button) findViewById(R.id.set_chore_button);
        set_chore_button.setVisibility(VISIBLE);
        set_chore_button.setBackgroundColor(Color.TRANSPARENT);

        set_chore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Item_Accpected.class));
            }
        });

        check_chore_button = (Button) findViewById(R.id.check_chore_button);
        check_chore_button.setVisibility(VISIBLE);
        check_chore_button.setBackgroundColor(Color.TRANSPARENT);

        check_chore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Chore_Accept_Or_Reject.class));
            }
        });


    }
}
