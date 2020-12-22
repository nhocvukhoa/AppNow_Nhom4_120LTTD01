package com.example.now1.home.Tab.gantoi;

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

public class GanToiFrag extends Fragment {

    private ListView listgantoi;
    Context context;
    private ConstraintLayout relagantoi;
    private ArrayList<MonAnGanToiModel> monangtData;
    private CustomAdapterGanToi customAdapter;
    private MonAnGanToiModel monAnGanToiModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_gan_toi, container, false);
        listgantoi = root.findViewById(R.id.listgantoi);
        relagantoi= root.findViewById(R.id.relagantoi);
        monangtData = new ArrayList<>();

        listgantoiData();
        customAdapter = new CustomAdapterGanToi(context, monangtData);
        listgantoi.setAdapter(customAdapter);
        registerForContextMenu(listgantoi);
        listgantoi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, monangtData.get(position).getIdtenmonangt(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void listgantoiData() {

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(1);
        monAnGanToiModel.setIdimggt(R.drawable.qa1);
        monAnGanToiModel.setIdtenmonangt("Ly Ly - Cá Bò Viên Chiên");
        monAnGanToiModel.setIddiachigt("278 Lê Văn Thọ, TP Hồ Chí Minh");
        monAnGanToiModel.setIdgiagt("Giảm món");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(2);
        monAnGanToiModel.setIdimggt(R.drawable.qa2);
        monAnGanToiModel.setIdtenmonangt("Ăn Vặt Vịt Con - Xiên que");
        monAnGanToiModel.setIddiachigt("205/27A Bình Trị Đông, TP Hồ Chí Minh");
        monAnGanToiModel.setIdgiagt("Freeship");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(3);
        monAnGanToiModel.setIdimggt(R.drawable.qa3);
        monAnGanToiModel.setIdtenmonangt("Cơm Chiên & Nui Xào Bò");
        monAnGanToiModel.setIddiachigt("102/12 Cổng Quỳnh, TP Hồ Chí Minh");
        monAnGanToiModel.setIdgiagt("Mã Giảm 30k");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(4);
        monAnGanToiModel.setIdimggt(R.drawable.qa4);
        monAnGanToiModel.setIdtenmonangt("Bông Food & Drink");
        monAnGanToiModel.setIddiachigt("7 Đường 3/2, TP Đà Nẵng");
        monAnGanToiModel.setIdgiagt("Freeship");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(5);
        monAnGanToiModel.setIdimggt(R.drawable.qa5);
        monAnGanToiModel.setIdtenmonangt("Ăn vặt Thùy Dương");
        monAnGanToiModel.setIddiachigt("K18/12 Ông Ích Khiêm, TP Đà Nẵng");
        monAnGanToiModel.setIdgiagt("Freeship");
        monangtData.add(monAnGanToiModel);

        monAnGanToiModel=new MonAnGanToiModel();
        monAnGanToiModel.setId(6);
        monAnGanToiModel.setIdimggt(R.drawable.qa6);
        monAnGanToiModel.setIdtenmonangt("Trà Sữa Chú Chim");
        monAnGanToiModel.setIddiachigt("148 Đống Đa, TP Đà Nẵng");
        monAnGanToiModel.setIdgiagt("Mã giảm 15k");
        monangtData.add(monAnGanToiModel);
    }
}