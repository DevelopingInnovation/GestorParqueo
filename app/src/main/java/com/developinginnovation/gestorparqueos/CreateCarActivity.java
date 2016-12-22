package com.developinginnovation.gestorparqueos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_car);


        Button btnAccept = (Button)findViewById(R.id.btn_accept_car);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateCarActivity.this, "Registro con éxito", Toast.LENGTH_LONG).show();
                Intent main = new Intent(CreateCarActivity.this,HomeActivity.class);
                startActivity(main);
            }
        });
    }
}
