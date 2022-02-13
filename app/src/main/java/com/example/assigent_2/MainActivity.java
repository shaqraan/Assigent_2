package com.example.assigent_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        Thread t = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    finish();
                    Intent i = new Intent(MainActivity.this, Login.class);
                    startActivity(i);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        };
        t.start();


    }
}


