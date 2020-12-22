package com.example.now1.toi.ThongTinNguoiDung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.now1.R;

public class ChonNghe extends AppCompatActivity {

    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_nghe);
        back=findViewById(R.id.imageView5a);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });
    }
    private void openMainActivity(){
        Intent intent=new Intent(this,ThongTinNguoiDung.class);
        startActivity(intent);
    }
}