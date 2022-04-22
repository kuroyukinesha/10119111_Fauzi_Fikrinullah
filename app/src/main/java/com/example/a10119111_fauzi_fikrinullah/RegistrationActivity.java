package com.example.a10119111_fauzi_fikrinullah;
// tanggal : 21 april 2022
// nim : 10119111
// nama : fauzi fikrinullah
// kelas : if-3

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button BtnRegister    = findViewById(R.id.btnRegister);
        BtnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegister:
                Intent pindahIntent11 = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(pindahIntent11);
                break;
        }
    }
}












