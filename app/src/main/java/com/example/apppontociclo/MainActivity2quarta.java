package com.example.apppontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2quarta extends AppCompatActivity {
    Button btnvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2quarta);
        btnvoltar=(Button) findViewById(R.id.btnvoltar);


        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vo) {
                Intent voltar = new Intent(MainActivity2quarta.this, TerceiraMainActivity2.class);
                startActivity(voltar);


            }
        });
    }
}