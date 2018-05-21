package com.example.marcoscarvalho.trabalhoandroidmarcos.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sistemas on 05/05/2018.
 */

public class RetrofitClient
{
    private static final String URL = "https://jsonplaceholder.typicode.com";

    public Retrofit obterInstanciaClient()
    {
        Retrofit instancia = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();
        return instancia;
    }
}