package com.example.myapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.MainActivity;
import com.example.myapp.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);

        login = findViewById(R.id.btn_login);
        username = findViewById(R.id.et_user);
        password = findViewById(R.id.et_pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().equalsIgnoreCase("020302")) {
                    login_acc();
                } else {
                    Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_LONG).show();
                }

            }
        });

    }

    private void login_acc() {
        String user_name = username.getText().toString();

        Intent i = new Intent(this, MainActivity.class);

        i.putExtra("Username",user_name);

        startActivity(i);
    }
}