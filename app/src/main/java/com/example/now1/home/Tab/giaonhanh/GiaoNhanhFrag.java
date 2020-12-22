package com.example.now1.home.Tab.giaonhanh;

import android.content.Context;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.now1.R;

import java.util.ArrayList;

public class GiaoNhanhFrag extends Fragment {

    private ListView listgiaonhanh;
    Context context;
    private ConstraintLayout relagiaonhanh;
    private ArrayList<MonAnGiaoNhanhModel> monanGNData;
    private CustomAdapterGiaoNhanh customAdapter;
    private MonAnGiaoNhanhModel monAnGiaoNhanhModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_giao_nhanh, container, false);
        listgiaonhanh = root.findViewById(R.id.listgiaonhanh);
        relagiaonhanh= root.findViewById(R.id.relagiaonhanh);
        monanGNData = new ArrayList<>();

        listgiaonhanhData();
        customAdapter = new CustomAdapterGiaoNhanh(context, monanGNData);
        listgiaonhanh.setAdapter(customAdapter);
        registerForContextMenu(listgiaonhanh);
        listgiaonhanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, monanGNData.get(position).getIdtenmonangn(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void listgiaonhanhData() {

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(1);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan1);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(2);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan2);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(3);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan3);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(4);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan4);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(5);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan1);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

        monAnGiaoNhanhModel=new MonAnGiaoNhanhModel();
        monAnGiaoNhanhModel.setId(6);
        monAnGiaoNhanhModel.setIdimggn(R.drawable.quan2);
        monAnGiaoNhanhModel.setIdtenmonangn("Bánh canh đường ray-Lê Độ");
        monAnGiaoNhanhModel.setIddiachign("K77A/09 Lê Độ, Đà Nẵng");
        monAnGiaoNhanhModel.setIdgiagn("31.000đ");
        monanGNData.add(monAnGiaoNhanhModel);

    }
}