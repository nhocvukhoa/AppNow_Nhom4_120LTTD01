package com.example.now1.toi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.DangNhap;
import com.example.now1.R;
import com.example.now1.thongbao.ThongBaoFrag;
import com.example.now1.thongbao.tintuc.TinTucTBAct;
import com.example.now1.toi.ThongTinNguoiDung.ThongTinNguoiDung;


public class ToiFrag extends Fragment {


    private ImageView ttcn;
    private TextView diachi;
    private Button dangxuat;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_toi, container, false);

        dangxuat=root.findViewById(R.id.dangxuat);
        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangNhap();
            }
        });

        diachi = root.findViewById(R.id.diachi);
        diachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiaChi();
            }
        });

        ttcn = root.findViewById(R.id.idttcn);
        ttcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongTinCaNhan();
            }
        });

        return root;
    }

    private void openDangNhap(){
        Intent intent=new Intent(ToiFrag.this.getActivity(), DangNhap.class);
        startActivity(intent);
    }

    public void openDiaChi(){
        Intent intent=new Intent(ToiFrag.this.getActivity(), DiaChi.class);
        startActivity(intent);
    }


    public void openThongTinCaNhan(){
        Intent intent=new Intent(ToiFrag.this.getActivity(), ThongTinNguoiDung.class);
        startActivity(intent);
    }
}