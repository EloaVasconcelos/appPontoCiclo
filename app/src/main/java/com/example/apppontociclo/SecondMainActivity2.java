package com.example.apppontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondMainActivity2 extends AppCompatActivity {
    Button btnproximo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main2);

        btnproximo= (Button) findViewById(R.id.btnproximo);

        btnproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {
                Intent proximo = new Intent(SecondMainActivity2.this,TerceiraMainActivity2.class);
                startActivity(proximo);

            }
        });
    }
}