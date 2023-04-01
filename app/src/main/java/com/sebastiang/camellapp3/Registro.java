package com.sebastiang.camellapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    Button SIGUIENTE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        SIGUIENTE=(Button)findViewById(R.id.Btn_22);
        SIGUIENTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Registro.this, Registro2.class);
                startActivity(i);

            }
        });
    }
}