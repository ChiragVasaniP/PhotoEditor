package com.editortools.simpysd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread = new Thread()
        {
            public void run()
            {
                try {
                    sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(SplashActivity.this,StartActivity.class);
                    startActivity(i);
                    finish();

                }
            }
        };thread.start();

    }
}