package com.example.a10119111_fauzi_fikrinullah;
// tanggal : 21 april 2022
// nim : 10119111
// nama : fauzi fikrinullah
// kelas : if-3
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button BtnBack    = findViewById(R.id.btnBack);
        BtnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                Intent pindahIntent11 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(pindahIntent11);
                break;
        }
    }


}