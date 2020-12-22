package com.example.now1.daluu.tabchitietquananyeuthich.giaohang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.now1.R;

import java.util.ArrayList;


public class giaohang extends Fragment {
    ListView listview_datdon;
    Context context;
    //Lấy trong đường bao bọc khung của list_profile

    ArrayList<DatDonModel> datdonData;
    DatDonAdapter datdonAdapter;
    DatDonModel datdonModel;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        context=getActivity();
        View root=inflater.inflate(R.layout.fragment_giaohang, container, false);
        listview_datdon = root.findViewById(R.id.listview_datdon);
        datdonData = new ArrayList<>();

        //add Countries Data
        DatDonData();

        datdonAdapter = new DatDonAdapter(context,datdonData);
        listview_datdon.setAdapter(datdonAdapter);
        registerForContextMenu(listview_datdon);
        listview_datdon = root.findViewById(R.id.listview_datdon);



        listview_datdon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,datdonData.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    private void DatDonData() {
        //trasua1
        datdonModel = new DatDonModel();
        datdonModel.setId(1);
        datdonModel.setAvata(R.drawable.trasua1);
        datdonModel.setTen("Trà sữa trân châu");
        datdonModel.setMota1("Trân châu hoàng kim loại mới");
        datdonModel.setMota2("999+ đã bán | 50+ thích");
        datdonModel.setGia("32,250đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua2
        datdonModel = new DatDonModel();
        datdonModel.setId(2);
        datdonModel.setAvata(R.drawable.trasua2);
        datdonModel.setTen("Trà sữa trân châu pudding");
        datdonModel.setMota1("Trân châu hoàng kim loại mới");
        datdonModel.setMota2("999+ đã bán | 50+ thích");
        datdonModel.setGia("41,250đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua3
        datdonModel = new DatDonModel();
        datdonModel.setId(3);
        datdonModel.setAvata(R.drawable.trasua3);
        datdonModel.setTen("Lục trà sữa trân châu");
        datdonModel.setMota1("Trân châu hoàng kim loại mới");
        datdonModel.setMota2("999+ đã bán | 10+ thích");
        datdonModel.setGia("32,250đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua4
        datdonModel = new DatDonModel();
        datdonModel.setId(4);
        datdonModel.setAvata(R.drawable.trasua4);
        datdonModel.setTen("Chanh dây trà xanh");
        datdonModel.setMota1("Vị mát từ lá trà và hương thơm của chanh dây");
        datdonModel.setMota2("999+ đã bán | 12+ thích");
        datdonModel.setGia("36,750đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua5
        datdonModel = new DatDonModel();
        datdonModel.setId(5);
        datdonModel.setAvata(R.drawable.trasua5);
        datdonModel.setTen("Trà sữa pudding đậu đỏ");
        datdonModel.setMota1("Hương vị ngọt ngào từ đậu đỏ");
        datdonModel.setMota2("999+ đã bán | 9+ thích");
        datdonModel.setGia("30,500đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua6
        datdonModel = new DatDonModel();
        datdonModel.setId(6);
        datdonModel.setAvata(R.drawable.trasua6);
        datdonModel.setTen("Matcha đậu đỏ");
        datdonModel.setMota1("Vị ngon hảo hạng");
        datdonModel.setMota2("999+ đã bán | 15+ thích");
        datdonModel.setGia("33,750đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua7
        datdonModel = new DatDonModel();
        datdonModel.setId(7);
        datdonModel.setAvata(R.drawable.trasua7);
        datdonModel.setTen("Matcha Latte");
        datdonModel.setMota1("Matcha kết hợp cà phê");
        datdonModel.setMota2("999+ đã bán | 10+ thích");
        datdonModel.setGia("38,000đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);

        //trasua8
        datdonModel = new DatDonModel();
        datdonModel.setId(8);
        datdonModel.setAvata(R.drawable.trasua8);
        datdonModel.setTen("Trà Oolong");
        datdonModel.setMota1("Giải khát tuyệt vời");
        datdonModel.setMota2("999+ đã bán | 10+ thích");
        datdonModel.setGia("28,000đ");
        datdonModel.setThem(R.drawable.ic_them);
        datdonData.add(datdonModel);
    }
}
