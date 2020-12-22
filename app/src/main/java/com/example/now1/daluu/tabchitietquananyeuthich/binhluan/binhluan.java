package com.example.now1.daluu.tabchitietquananyeuthich.binhluan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.now1.R;

import java.util.ArrayList;


public class binhluan extends Fragment {
    ListView listview_binhluan;
    Context context;
    //Lấy trong đường bao bọc khung của list_profile

    ArrayList<BinhLuanModel> binhluanData;
    BinhLuanAdapter binhluanAdapter;
    BinhLuanModel binhluanModel;

    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_binhluan, container, false);
        listview_binhluan = root.findViewById(R.id.listview_binhluan);
        binhluanData = new ArrayList<>();

        //add Countries Data
        BinhLuanData();

        binhluanAdapter = new BinhLuanAdapter(context,binhluanData);
        listview_binhluan.setAdapter(binhluanAdapter);
        registerForContextMenu(listview_binhluan);
        listview_binhluan = root.findViewById(R.id.listview_binhluan);
        listview_binhluan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,binhluanData.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
    private void BinhLuanData() {
        //binhluan1
        binhluanModel = new BinhLuanModel();
        binhluanModel.setId(1);
        binhluanModel.setAvata(R.drawable.chris);
        binhluanModel.setTen("Thảo Nguyên");
        binhluanModel.setTime("Hôm qua 15:08");
        binhluanModel.setDanhgia("Rất thích trà sữa ở đây. Lâu rồi hôm nay mới order lại nhưng hương vị hơi khác trước một chút. Nhìn chung vẫn ổn.");
        binhluanModel.setTrasua(R.drawable.trasua1);
        binhluanData.add(binhluanModel);

        //binhluan2
        binhluanModel = new BinhLuanModel();
        binhluanModel.setId(2);
        binhluanModel.setAvata(R.drawable.nntu);
        binhluanModel.setTen("Tuấn Nguyễn");
        binhluanModel.setTime("Hôm qua 16:38");
        binhluanModel.setDanhgia("Lục trà rất ngon. Uống không biết bao nhiêu lần rồi mà mua ở quán không được giảm giá");
        binhluanModel.setTrasua(R.drawable.trasua2);
        binhluanData.add(binhluanModel);

        //binhluan3
        binhluanModel = new BinhLuanModel();
        binhluanModel.setId(3);
        binhluanModel.setAvata(R.drawable.murakami);
        binhluanModel.setTen("Hạnh Lê");
        binhluanModel.setTime("Hôm qua 17:30");
        binhluanModel.setDanhgia("Uống xong mới nhớ chụp ảnh ạ. Trà sữa ngon nhưng hơi ngọt. Thơm vị trà và có sẵn trân châu trắng luôn.");
        binhluanModel.setTrasua(R.drawable.trasua3);
        binhluanData.add(binhluanModel);

        //binhluan3
        binhluanModel = new BinhLuanModel();
        binhluanModel.setId(4);
        binhluanModel.setAvata(R.drawable.taylor);
        binhluanModel.setTen("Kiệt Quách");
        binhluanModel.setTime("Hôm qua 17:33");
        binhluanModel.setDanhgia("Ngon hết sức ngon, đậm vị, ngọt vừa phải, 10 của 10.");
        binhluanModel.setTrasua(R.drawable.trasua4);
        binhluanData.add(binhluanModel);


    }
}