package com.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    EditText fname, lname, email, password, confirmpassword;
    Button signup;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.confirmpassword);

        signup = findViewById(R.id.signup_button);
        login = findViewById(R.id.login);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first, last, mail, pass, confirmPass;

                first = fname.getText().toString();
                last = lname.getText().toString();
                mail = email.getText().toString();
                pass = password.getText().toString();
                confirmPass = confirmpassword.getText().toString();

                if(first.equals("")){
                    Toast.makeText(SignUp.this, "First Name is required", Toast.LENGTH_LONG).show();
                }
                if(last.equals("")){
                    Toast.makeText(SignUp.this, "Last Name is required", Toast.LENGTH_LONG).show();
                }
                if(mail.equals("")){
                    Toast.makeText(SignUp.this, "Email Address is required", Toast.LENGTH_LONG).show();
                }
                if(pass.equals("")){
                    Toast.makeText(SignUp.this, "Password is required", Toast.LENGTH_LONG).show();
                }
                if(confirmPass.equals("")){
                    Toast.makeText(SignUp.this, "Confirm Password is required", Toast.LENGTH_LONG).show();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(SignUp.this, MainActivity.class);
                startActivity(r);
                finish();
            }
        });

    }
}