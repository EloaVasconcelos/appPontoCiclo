package com.example.apppontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2quinta extends AppCompatActivity {
    Button btnvoltar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2quinta);


        btnvoltar2=(Button) findViewById(R.id.btnvoltar2);

        btnvoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vol) {
                Intent voltar2 = new Intent(MainActivity2quinta.this,TerceiraMainActivity2.class);
                startActivity(voltar2);
            }
        });
    }
}