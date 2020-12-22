package com.example.now1.thongbao;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.now1.R;
import com.example.now1.thongbao.caidatthongbao.CaiDatThongBaoAct;
import com.example.now1.thongbao.khuyenmai.KhuyenMaiTBAct;
import com.example.now1.thongbao.tintuc.TinTucTBAct;

import java.util.ArrayList;


public class ThongBaoFrag extends Fragment {

    private ListView listView, listView2;
    Context context;
    private ConstraintLayout rela, rela2;
    private ImageView thongbaott,thongbaokm,caidattb;
    private ArrayList<TinhTrangModel> tinhtrangData;
    private CustomAdapter2 customAdapter2;
    private TinhTrangModel tinhtrangModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_thong_bao, container, false);
        context=getActivity();
        // Thông báo tin tức
        thongbaott=root.findViewById(R.id.thongbaott);
        thongbaott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongBaoTinTuc();
            }
        });

        // Thông báo khuyến mãi
        thongbaokm=root.findViewById(R.id.thongbaokm);
        thongbaokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongBaoKhuyenMai();
            }
        });

        // Cài đặt thông báo
        caidattb=root.findViewById(R.id.caidattb);
        caidattb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaiDatThongBao();
            }
        });

        listView2 = root.findViewById(R.id.listView2);
        rela2 = root.findViewById(R.id.rela2);
        tinhtrangData = new ArrayList<>();

        //add Countries Data
        listtinhtrang();

        customAdapter2 = new CustomAdapter2(context, tinhtrangData);
        listView2.setAdapter(customAdapter2);
        registerForContextMenu(listView2);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, tinhtrangData.get(position).getTieude2(), Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    private void openThongBaoTinTuc(){
        Intent intent=new Intent(ThongBaoFrag.this.getActivity(), TinTucTBAct.class);
        startActivity(intent);
    }

    private void openThongBaoKhuyenMai(){
        Intent intent=new Intent(ThongBaoFrag.this.getActivity(), KhuyenMaiTBAct.class);
        startActivity(intent);
    }

    private void openCaiDatThongBao(){
        Intent intent=new Intent(ThongBaoFrag.this.getActivity(), CaiDatThongBaoAct.class);
        startActivity(intent);
    }
    private void listtinhtrang() {

        tinhtrangModel=new TinhTrangModel();
        tinhtrangModel.setId(1);
        tinhtrangModel.setAvata2(R.drawable.banhcanh);
        tinhtrangModel.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel.setNoidung2("Đơn hàng của bạn tại Bánh Canh Đường Ray - Lê Độ đã được Phong Trần Hải giao thành công. Cảm ơn bạn đã sử dụng dịch vụ Now.");
        tinhtrangModel.setTime("24/10/2020 13:04");
        tinhtrangData.add(tinhtrangModel);

        tinhtrangModel=new TinhTrangModel();
        tinhtrangModel.setId(2);
        tinhtrangModel.setAvata2(R.drawable.chethai);
        tinhtrangModel.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel.setNoidung2("Đơn hàng của bạn tại Chè Liên Đà Nẵng đã được Đức Ngô Mạnh giao thành công. Cảm ơn bạn đã sử dụng dịch vụ Now.");
        tinhtrangModel.setTime("22/10/2020 9:15");
        tinhtrangData.add(tinhtrangModel);

        tinhtrangModel=new TinhTrangModel();
        tinhtrangModel.setId(3);
        tinhtrangModel.setAvata2(R.drawable.caffemuoi);
        tinhtrangModel.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel.setNoidung2("Đơn hàng của bạn tại Cà Phê Muối Samdi-Mike đã được Hiền Văn Lê giao thành công. Cảm ơn bạn đã sử dụng dịch vụ Now.");
        tinhtrangModel.setTime("17/10/2020 10:20");
        tinhtrangData.add(tinhtrangModel);

        tinhtrangModel=new TinhTrangModel();
        tinhtrangModel.setId(4);
        tinhtrangModel.setAvata2(R.drawable.comga);
        tinhtrangModel.setTieude2("Đã hoàn tất đơn");
        tinhtrangModel.setNoidung2("Đơn hàng của bạn tại Cơm gà Vân - Lê Đình Lý đã được Đức Văn Trần giao thành công. Cảm ơn bạn đã sử dụng dịch vụ Now.");
        tinhtrangModel.setTime("11/10/2020 18:20");
        tinhtrangData.add(tinhtrangModel);

    }
}