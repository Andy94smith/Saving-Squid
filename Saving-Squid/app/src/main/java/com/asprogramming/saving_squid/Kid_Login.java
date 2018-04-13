package com.asprogramming.saving_squid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.VISIBLE;

public class Kid_Login extends Activity {

    private Button login_kids_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid__login);

        login_kids_button = (Button) findViewById(R.id.login_kids_button);
        login_kids_button.setVisibility(VISIBLE);
        login_kids_button.setBackgroundColor(Color.TRANSPARENT);

        login_kids_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(MainActivity.job_accepted)
                    startActivity(new Intent(getApplicationContext(), Item_Accpected.class));
                else
                    startActivity(new Intent(getApplicationContext(), Kids_Item_Request.class));
            }
        });

    }
}
