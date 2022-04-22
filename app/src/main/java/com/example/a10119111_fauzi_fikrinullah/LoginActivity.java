package com.example.a10119111_fauzi_fikrinullah;
// tanggal : 21 april 2022
// nim : 10119111
// nama : fauzi fikrinullah
// kelas : if-3

import androidx.appcompat.app.AppCompatActivity;
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

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

//    TextView TvCreateAccount;
//    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView TvCreateAccount    = findViewById(R.id.tvCreateAccount);
        Button BtnLogin             = findViewById(R.id.btnLogin);
        TvCreateAccount.setOnClickListener(this);
        BtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvCreateAccount:
                Intent pindahIntent1 = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(pindahIntent1);
                break;
            case R.id.btnLogin:
                Intent pindahIntent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }

}

















