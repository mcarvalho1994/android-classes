package com.example.marcoscarvalho.trabalhoandroidmarcos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrarAluno(View view)
    {
        Intent i = new Intent(this, CadastroActivity.class);
        startActivity(i);
    }
}
