package com.example.now1.toi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

public class DiaChi extends AppCompatActivity {

    ImageView back;
    TextView right1,right2,right3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_chi);
        //1
        back=(ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });
        //2
        right1=(TextView) findViewById(R.id.right1);
        right1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDiaChi2();
            }
        });
        //3
        right2=(TextView) findViewById(R.id.right2);
        right2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDiaChi2();
            }
        });
        //4
        right3=(TextView) findViewById(R.id.right3);
        right3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openDiaChi2();
            }
        });
    }
    public void openMainActivity(){
        Intent intent=new Intent(DiaChi.this,ToiFrag.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
    public void openDiaChi2(){
        Intent intent=new Intent(this,TaoDiaChi.class);
        startActivity(intent);
    }
}