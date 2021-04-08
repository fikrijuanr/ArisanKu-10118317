package com.e.a10118317_tugasactivity_arisanku;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvUsername;
    private String username;
    private Button btnLogout, btnProfil, btnAboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
// ------------------------------------- BUTTON --------------------------------------------------
        btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // action
                Intent logout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(logout);
            }
        });

        btnProfil = findViewById(R.id.btn_profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // action
                Intent profil = new Intent();
                profil.setAction(Intent.ACTION_VIEW);
                profil.addCategory(Intent.CATEGORY_BROWSABLE);
                profil.setData(Uri.parse("https://github.com/fikrijuanr/ArisanKu-10118317"));
                startActivity(profil);
            }
        });

        btnAboutus= findViewById(R.id.btn_aboutus);
        btnAboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // action
                Intent aboutus = new Intent(MainActivity.this, AboutusActivity.class);
                startActivity(aboutus);
            }
        });
// --------------------------------------- BUTTON -------------------------------------------------
    }

    public void initView(){

        tvUsername = findViewById(R.id.txt_username);
    }

    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra("username");

       tvUsername.setText(username);
    }
}
