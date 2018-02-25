package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Membuat Handler baru
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Membuat Intent untuk berpindah ke halaman login
                startActivity(new Intent(SplashScreen.this, Login.class));
                finish();
            }
        }, 4000);
    }
}