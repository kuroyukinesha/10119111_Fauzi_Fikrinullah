package com.example.a10119111_fauzi_fikrinullah;
// tanggal : 21 april 2022
// nim : 10119111
// nama : fauzi fikrinullah
// kelas : if-3
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtnLogout    = findViewById(R.id.btnLogout);
        Button BtnProfile   = findViewById(R.id.btnProfile);
        BtnLogout.setOnClickListener(this);
        BtnProfile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogout:
                Intent pindahIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(pindahIntent);
            break;
            case R.id.btnProfile:
                Intent pindahIntent2 = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }
}









