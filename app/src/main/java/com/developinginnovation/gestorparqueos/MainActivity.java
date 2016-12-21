package com.developinginnovation.gestorparqueos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAccept = (Button)findViewById(R.id.btn_accept_login);
        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(MainActivity.this,HomeActivity.class);
                startActivity(main);
            }
        });

        Button btnRegistry = (Button)findViewById(R.id.btnRegistry);
        btnRegistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registry = new Intent(MainActivity.this,CreateUserActivity.class);
                startActivity(registry);
            }
        });

    }



}
