package com.example.apppontociclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2sexta extends AppCompatActivity {

    Button btnvoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2sexta);


        btnvoltar3=(Button)findViewById(R.id.btnvoltar3);


        btnvoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View volta) {
                Intent voltar3 = new Intent(MainActivity2sexta.this, TerceiraMainActivity2.class);
                startActivity(voltar3);

            }
        });
    }
}
