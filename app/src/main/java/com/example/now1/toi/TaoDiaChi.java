package com.example.now1.toi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.now1.R;

public class TaoDiaChi extends AppCompatActivity {

    ImageView back2,danhba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tao_dia_chi);
        //1
        back2=(ImageView) findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDiaChi1();
            }
        });
        //2
        danhba=(ImageView) findViewById(R.id.danhba);
        danhba.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDanhBa();
            }
        });


    }
    public void openDiaChi1(){
        Intent intent=new Intent(this,DiaChi.class);
        startActivity(intent);
    }
    public void openDanhBa(){
        Intent intent=new Intent(this,DanhBa.class);
        startActivity(intent);
    }
}