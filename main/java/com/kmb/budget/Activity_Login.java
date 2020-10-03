package com.kmb.budget;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Login extends AppCompatActivity {
    private Button button;
    RelativeLayout rellay1;
    Handler handler =new Handler();
    Runnable runnable =new Runnable() {
        @Override
        public void run() {

            rellay1.setVisibility(View.VISIBLE);

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);


        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);

        handler.postDelayed(runnable, 2000);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

    }

        public void openMainActivity(){

            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        // Enables Always-on

    }
