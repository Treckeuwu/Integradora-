package com.example.integradorav1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.integradorav1.api.apiprueba;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(v -> {
            Intent intent = new Intent(this, apiprueba.class);
            startActivity(intent);
        });


    }
}