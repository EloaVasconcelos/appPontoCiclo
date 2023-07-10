package com.example.apppontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnentrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnentrar= (Button) findViewById(R.id.btnentrar);

        btnentrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View e) {
                Intent Entrar = new Intent(MainActivity.this,SecondMainActivity2.class);
                startActivity(Entrar);

            }
        });
    }
}