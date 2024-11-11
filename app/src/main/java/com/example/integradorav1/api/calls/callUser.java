package com.example.integradorav1.api.calls;


import com.example.integradorav1.api.model.usermodel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface callUser
{
    @GET("usuario/{id}")
    Call<usermodel> getUser(@Path("id") int id);



}
