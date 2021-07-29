package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login_button;
    TextView sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.pass);
        login_button = findViewById(R.id.login_button);
        sign = findViewById(R.id.sign_up);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail, pass;

                mail = username.getText().toString();
                pass = password.getText().toString();

                if (mail.equals("")) {
                    Toast.makeText(MainActivity.this, "Username is Blank", Toast.LENGTH_LONG).show();
                }
                if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Password is Blank", Toast.LENGTH_LONG).show();
                }
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SignUp.class);
                startActivity(i);
                finish();
            }
        });

    }
}