package com.berkaykaanedikli.syf207uyg11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Ekle, Sifirla;
    TextView txtToplam, txtIndis;
    EditText editTxtSayi;
    public Integer[] notlar = new Integer[6];
    public int indis = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ekle = findViewById(R.id.btnEkle);
        Sifirla = findViewById(R.id.btnSifirla);
        txtToplam = findViewById(R.id.txtViewToplam);
        txtIndis = findViewById(R.id.txtViewIndis);
        editTxtSayi = findViewById(R.id.edtiTxtSayi);
        Ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (indis < 6){
                    int sayi;
                    sayi = Integer.parseInt(editTxtSayi.getText().toString());
                    notlar[indis] = sayi;
                    indis++;
                    txtIndis.setText("Indis: " + indis);
                    int toplam = 0;
                    for (int a = 0; a<indis; a++){
                        toplam += notlar[a];
                    }
                    txtToplam.setText("Toplam: " + toplam);
                    editTxtSayi.getText().clear();
                }
                else {
                    txtIndis.setText("Dizi Dolu");
                }
            }
        });
        Sifirla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indis=0;
                txtIndis.setText("Indis:    0");
                txtToplam.setText("Toplam: 0");
                notlar = new Integer[6];
            }
        });
    }
}