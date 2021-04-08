package com.e.a10118317_tugasactivity_arisanku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

    private Button btnRegistrasi;
    private EditText etUsername, etPassword, etKota, etNamalengkap;
    private String username, namalengkap, kota, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();
        setData();

        btnRegistrasi = findViewById(R.id.btn_registrasi);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // action
                Intent registrasi = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(registrasi);
            }
        });
    }

    public  void initView(){
        btnRegistrasi = findViewById(R.id.btn_registrasi);
        etNamalengkap = findViewById(R.id.et_namalengkap);
        etKota = findViewById(R.id.et_kota);
        etPassword = findViewById(R.id.et_password);
        etUsername = findViewById(R.id.et_username);
    }

    public void setData(){
        btnRegistrasi = findViewById(R.id.btn_registrasi);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();
                namalengkap = etNamalengkap.getText().toString();
                kota = etKota.getText().toString();

                //action
                Intent intent = new Intent(RegisterActivity.this, ProfilActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                intent.putExtra("namalengkap", namalengkap);
                intent.putExtra("kota", kota);
                startActivity(intent);
            }
        });


    }
}
