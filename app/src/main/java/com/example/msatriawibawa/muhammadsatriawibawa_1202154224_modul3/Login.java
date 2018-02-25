package com.example.msatriawibawa.muhammadsatriawibawa_1202154224_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //Membuat variable
    EditText tUser, tPass;
    Button bLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Mengambil ID untuk variable baru
        tUser = (EditText) findViewById(R.id.user);
        tPass = (EditText) findViewById(R.id.pass);
        bLogin = (Button) findViewById(R.id.btnlogin);

    }

    public void Login(View view) {
        if (tUser.getText().toString().contains("EAD") && tPass.getText().toString().contains("MOBILE")) {

            startActivity(new Intent(this, MainActivity.class));

        } else {
            Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
