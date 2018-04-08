package com.asprogramming.saving_squid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Parent_Login extends AppCompatActivity {

    private Button login_parent_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent__login);

        login_parent_button = (Button) findViewById(R.id.login_parent_button);
        login_parent_button.setVisibility(VISIBLE);
        login_parent_button.setBackgroundColor(Color.TRANSPARENT);

        login_parent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Parent_Menu.class));
            }
        });
    }
}
