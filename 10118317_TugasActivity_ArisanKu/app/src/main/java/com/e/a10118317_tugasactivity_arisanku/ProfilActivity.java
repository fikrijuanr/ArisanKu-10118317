package com.e.a10118317_tugasactivity_arisanku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ProfilActivity extends Activity {

    private TextView tvUsername, tvNamalengkap, tvKota, tvPassword;
    private String username, password, kota, namalengkap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        initView();
        setData();
    }

    public void initView(){
        tvNamalengkap = findViewById(R.id.txt_namalengkap);
        tvUsername = findViewById(R.id.t_username);
        tvKota = findViewById(R.id.txt_kota);
        tvPassword = findViewById(R.id.txt_password);
    }
    public void setData(){
        Intent profil = getIntent();
        namalengkap = profil.getStringExtra("namalengkap");
        username = profil.getStringExtra("username");
        password = profil.getStringExtra("password");
        kota = profil.getStringExtra("kota");

        tvUsername.setText(username);
        tvPassword.setText(password);
        tvNamalengkap.setText(namalengkap);
        tvKota.setText(kota);
    }
}
