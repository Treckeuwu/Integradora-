package com.example.integradorav1.api;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.example.integradorav1.R;
import com.example.integradorav1.api.calls.callUser;
import com.example.integradorav1.api.model.usermodel;

public class apiprueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);


        callUser serviciochido = apiclient.instanciaRetrofit().create(callUser.class);

        Call<usermodel> call= serviciochido.getUser(6);
        call.enqueue(new Callback<usermodel>() {
            @Override
            public void onResponse(Call<usermodel> call, Response<usermodel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    usermodel user = response.body();
                    Log.d("API", "Nombre: " + user.getNombresillo());
                } else {
                    Log.e("API", "Respuesta sin éxito, código: " + response.code());
                    Log.e("API", "Cuerpo de la respuesta: " + response.message());  // Agregado para ver más detalles.
                }
            }


            @Override
            public void onFailure(Call<usermodel> call, Throwable throwable) {
                Log.e("MainActivity", "Fallo en la conexión: " + throwable.getMessage());
            }
        });


    }
}