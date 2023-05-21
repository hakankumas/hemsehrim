package com.hakankumas.hemsehrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gezi_rehberi extends AppCompatActivity {

    Button btn_ana_sayfa;
    Button btn_etkinlikler;
    Button btn_iletisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gezi_rehberi);

        // ANA SAYFA
        btn_ana_sayfa = findViewById(R.id.ana_sayfa);

        //Butona tıklandığında
        btn_ana_sayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ana_sayfa_sayfasi = new Intent(gezi_rehberi.this, MainActivity.class);
                startActivity(ana_sayfa_sayfasi);
            }
        });


        // ETKİNLİK
        btn_etkinlikler = findViewById(R.id.etkinlikler);

        //Butona tıklandığında
        btn_etkinlikler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent etkinlikler_sayfasi = new Intent(gezi_rehberi.this, etkinlikler.class);
                startActivity(etkinlikler_sayfasi);
            }
        });


        // İLETİŞİM
        btn_iletisim = findViewById(R.id.iletisim);

        //Butona tıklandığında
        btn_iletisim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iletisim_sayfasi = new Intent(gezi_rehberi.this, iletisim.class);
                startActivity(iletisim_sayfasi);
            }
        });

    }
}