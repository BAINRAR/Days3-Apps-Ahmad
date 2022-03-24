package com.example.myapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapps.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);

        login = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.et_user);
        password = (EditText) findViewById(R.id.et_pass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("12345")) {
                    login_berhasil();
                } else {
                    Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_LONG).show();
                }

            }
        }
        );

    }

    private void login_berhasil() {
        String user_name = username.getText().toString();

        Intent i = new Intent(this, MainActivity.class);

        i.putExtra("username",user_name);

        startActivity(i);
    }
}
