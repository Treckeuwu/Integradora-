package com.example.integradorav1.splashes;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.integradorav1.R;
import com.example.integradorav1.api.apiprueba;

import java.util.Timer;

public class Main_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                setContentView(R.layout.activity_main_splash);

            }
            public void onFinish() {
                Intent intent = new Intent(Main_splash.this, apiprueba.class);
                startActivity(intent);
                finish();
            }
        }.start();



    }
}