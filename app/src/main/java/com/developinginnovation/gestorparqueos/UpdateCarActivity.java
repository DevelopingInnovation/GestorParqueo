package com.developinginnovation.gestorparqueos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UpdateCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_car);

        Button btnAccept = (Button)findViewById(R.id.btn_accept_update_car);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UpdateCarActivity.this, "Actualización con éxito", Toast.LENGTH_LONG).show();
                Intent main = new Intent(UpdateCarActivity.this,HomeActivity.class);
                startActivity(main);
            }
        });

    }
}
