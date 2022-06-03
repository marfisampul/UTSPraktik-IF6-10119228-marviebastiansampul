package com.example.utspraktik_if6_10119228_marviebastiansampul.;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;

/*
 *     Tanggal Pengerjaan : 03/6/2022
 *     Nim : 10119228
 *     Nama : Marvie Bastian Sampul
 */

public class HasilActivity extends AppCompatActivity {

    TextView receiver_NIK, receiver_Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        receiver_NIK = (TextView)findViewById(R.id.nik);
        receiver_Nama = (TextView)findViewById(R.id.nama);
        Intent intent = getIntent();


        String str = intent.getStringExtra("message_key");
        String nm = intent.getStringExtra("message_key");


        receiver_NIK.setText(str);
        receiver_Nama.setText(nm);
    }
}