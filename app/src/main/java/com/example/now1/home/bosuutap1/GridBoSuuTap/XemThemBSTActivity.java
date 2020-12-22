package com.example.now1.home.bosuutap1.GridBoSuuTap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.now1.R;
import com.example.now1.home.HomeFrag;

import java.util.ArrayList;

public class XemThemBSTActivity extends AppCompatActivity {

    GridView gridView;
    Context context;
    RelativeLayout gridviewdata;
    ArrayList<ListBoSuuTapModel> bstData;
    BoSuuTapGridAdapter bstAdapter;
    ListBoSuuTapModel bst1Model;
    ImageView back;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_xem_them_bst);

        back=(ImageView) findViewById(R.id.idbackbst);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity();
            }
        });
        //getviews
        gridView = findViewById(R.id.gridviewbst);
        gridviewdata = (RelativeLayout) findViewById(R.id.gridbst);
        bstData = new ArrayList<>();

        //add Countries Data
        populateProductData();
        bstAdapter = new BoSuuTapGridAdapter(context,bstData);
        gridView.setAdapter(bstAdapter);
        registerForContextMenu(gridView);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,bstData.get(position).getNamebst(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),GridItemBSTActivity.class);
                intent.putExtra("name",bstData.get(position).getNamebst());
                intent.putExtra("image",bstData.get(position).getImagebst());
                startActivity(intent);
            }
        });

    }

    public void openMainActivity(){
        Intent intent=new Intent(XemThemBSTActivity.this, HomeFrag.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }

    private void populateProductData() {

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(1);
        bst1Model.setNamebst("Combo x3 với thẻ Visa");
        bst1Model.setImagebst(R.drawable.bst1);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(2);
        bst1Model.setNamebst("Bữa tiệc đa dạng");
        bst1Model.setImagebst(R.drawable.bst2);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(3);
        bst1Model.setNamebst("Combo lẩu tươi");
        bst1Model.setImagebst(R.drawable.bst3);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(4);
        bst1Model.setNamebst("Combo cơm Lào");
        bst1Model.setImagebst(R.drawable.bst4);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(5);
        bst1Model.setNamebst("Deal đỉnh mỗi ngày");
        bst1Model.setImagebst(R.drawable.bst5);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(6);
        bst1Model.setNamebst("Bao ăn - Bao xem phim");
        bst1Model.setImagebst(R.drawable.bst6);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(7);
        bst1Model.setNamebst("Lễ hội ẩm thực Coca ");
        bst1Model.setImagebst(R.drawable.bst7);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(8);
        bst1Model.setNamebst("Lễ hội ẩm thực châu Á");
        bst1Model.setImagebst(R.drawable.bst8);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(9);
        bst1Model.setNamebst("Giảm phí ship");
        bst1Model.setImagebst(R.drawable.bst9);
        bstData.add(bst1Model);

        bst1Model = new ListBoSuuTapModel();
        bst1Model.setId(10);
        bst1Model.setNamebst("Giảm 15% toàn menu");
        bst1Model.setImagebst(R.drawable.bst10);
        bstData.add(bst1Model);

    }
}