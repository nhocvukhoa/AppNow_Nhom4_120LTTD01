package com.example.now1.toi.ThongTinNguoiDung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.now1.R;
import com.example.now1.toi.ToiFrag;

public class ThongTinNguoiDung extends AppCompatActivity {

    private ImageView back;
    private ImageView DoiAvatar,DoiSoDT,DoiTen,DoiEmail,ChonNghe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinnguoidung);

        back=(ImageView) findViewById(R.id.imageViewbacktoi);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });

        DoiAvatar=(ImageView) findViewById(R.id.imageView4);
        DoiAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoiAvatar();
            }
        });

        DoiSoDT=(ImageView) findViewById(R.id.imageView3);
        DoiSoDT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoiSoDT();
            }
        });
        DoiTen=(ImageView) findViewById(R.id.imageView5);
        DoiTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoiTen();
            }
        });
        DoiEmail=(ImageView) findViewById(R.id.imageView6);
        DoiEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoiEmail();
            }
        });
        ChonNghe=(ImageView) findViewById(R.id.imageView10);
        ChonNghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoiNghe();
            }
        });
    }
    private void openDoiSoDT() {
        Intent intent = new Intent(this, DoiSoDT.class);
        startActivity(intent);
        finish();
    }
    private void openDoiAvatar() {
        Intent intent = new Intent(this, DoiAvatar.class);
        startActivity(intent);

    }
    private void openDoiTen() {
        Intent intent = new Intent(this, DoiTen.class);
        startActivity(intent);
        finish();
    }
    private void openDoiEmail() {
        Intent intent = new Intent(this, DoiEmail.class);
        startActivity(intent);
        finish();
    }
    private void openDoiNghe() {
        Intent intent = new Intent(this, ChonNghe.class);
        startActivity(intent);
        finish();
    }
    private void openMainActivity(){
        Intent intent=new Intent(ThongTinNguoiDung.this, ToiFrag.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}