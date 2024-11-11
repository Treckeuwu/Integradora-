package com.example.integradorav1.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiclient
{
    private static final String BASE_URL =  "https://pokeapi.co/api/v2/";
    private static Retrofit retrofit;

    public static Retrofit instanciaRetrofit()
    {
        if (retrofit == null)
        {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
