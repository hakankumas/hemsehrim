package com.hakankumas.hemsehrim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_gezi_rehberi;
    Button btn_etkinlikler;
    Button btn_iletisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // GEZİ REHBERİ
        btn_gezi_rehberi = findViewById(R.id.gezi_rehberi);

        //Butona tıklandığında
        btn_gezi_rehberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gezi_rehberi_sayfasi = new Intent(MainActivity.this, gezi_rehberi.class);
                startActivity(gezi_rehberi_sayfasi);
            }
        });

        // ETKİNLİK
        btn_etkinlikler = findViewById(R.id.etkinlikler);

        //Butona tıklandığında
        btn_etkinlikler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent etkinlikler_sayfasi = new Intent(MainActivity.this, etkinlikler.class);
                startActivity(etkinlikler_sayfasi);
            }
        });

        // İLETİŞİM
        btn_iletisim = findViewById(R.id.iletisim);

        //Butona tıklandığında
        btn_iletisim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iletisim_sayfasi = new Intent(MainActivity.this, iletisim.class);
                startActivity(iletisim_sayfasi);
            }
        });
    }
}