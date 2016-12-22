package com.developinginnovation.gestorparqueos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CreateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);


        Button btn_accept = (Button)findViewById(R.id.btn_accept);
        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateUserActivity.this, "Registro con éxito", Toast.LENGTH_LONG).show();
                Intent registry = new Intent(CreateUserActivity.this,HomeActivity.class);
                startActivity(registry);
            }
        });


    }
}
