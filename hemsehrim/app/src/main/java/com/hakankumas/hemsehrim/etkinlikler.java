package com.hakankumas.hemsehrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class etkinlikler extends AppCompatActivity {

    Button btn_ana_sayfa;
    Button btn_gezi_rehberi;
    Button btn_iletisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlikler);

        // ANA SAYFA
        btn_ana_sayfa = findViewById(R.id.ana_sayfa);

        //Butona tıklandığında
        btn_ana_sayfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ana_sayfa_sayfasi = new Intent(etkinlikler.this, MainActivity.class);
                startActivity(ana_sayfa_sayfasi);
            }
        });


        // GEZİ REHBERİ
        btn_gezi_rehberi = findViewById(R.id.gezi_rehberi);

        //Butona tıklandığında
        btn_gezi_rehberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gezi_rehberi_sayfasi = new Intent(etkinlikler.this, gezi_rehberi.class);
                startActivity(gezi_rehberi_sayfasi);
            }
        });


        // İLETİŞİM
        btn_iletisim = findViewById(R.id.iletisim);

        //Butona tıklandığında
        btn_iletisim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iletisim_sayfasi = new Intent(etkinlikler.this, iletisim.class);
                startActivity(iletisim_sayfasi);
            }
        });

    }
}