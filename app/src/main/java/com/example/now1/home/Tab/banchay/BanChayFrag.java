package com.example.now1.home.Tab.banchay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.now1.R;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;


public class BanChayFrag extends Fragment {

    private ListView listbanchay;
    Context context;
    private ConstraintLayout relabanchay;
    private ArrayList<MonAnBanChayModel> monanBCData;
    private CustomAdapterBanChay customAdapter;
    private MonAnBanChayModel monAnBanChayModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root = inflater.inflate(R.layout.fragment_ban_chay, container, false);
        listbanchay = root.findViewById(R.id.listbanchay);
        relabanchay = root.findViewById(R.id.relabanchay);
        monanBCData = new ArrayList<>();

        listbanchayData();
        customAdapter = new CustomAdapterBanChay(context, monanBCData);
        listbanchay.setAdapter(customAdapter);
        registerForContextMenu(listbanchay);
        listbanchay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context, monanBCData.get(position).getIdtenmonanbc(), Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
    private void listbanchayData() {

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(1);
        monAnBanChayModel.setIdimgbc(R.drawable.qa1);
        monAnBanChayModel.setIdtenmonanbc("Ly Ly - Cá Bò Viên Chiên");
        monAnBanChayModel.setIddiachibc("278 Lê Văn Thọ, TP Hồ Chí Minh");
        monAnBanChayModel.setIdgiabc("Giảm món");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(2);
        monAnBanChayModel.setIdimgbc(R.drawable.qa2);
        monAnBanChayModel.setIdtenmonanbc("Ăn Vặt Vịt Con - Xiên que");
        monAnBanChayModel.setIddiachibc("205/27A Bình Trị Đông, TP Hồ Chí Minh");
        monAnBanChayModel.setIdgiabc("Freeship");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(3);
        monAnBanChayModel.setIdimgbc(R.drawable.qa3);
        monAnBanChayModel.setIdtenmonanbc("Cơm Chiên & Nui Xào Bò");
        monAnBanChayModel.setIddiachibc("102/12 Cổng Quỳnh, TP Hồ Chí Minh");
        monAnBanChayModel.setIdgiabc("Mã Giảm 30k");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(4);
        monAnBanChayModel.setIdimgbc(R.drawable.qa4);
        monAnBanChayModel.setIdtenmonanbc("Bông Food & Drink");
        monAnBanChayModel.setIddiachibc("7 Đường 3/2, TP Đà Nẵng");
        monAnBanChayModel.setIdgiabc("Freeship");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(5);
        monAnBanChayModel.setIdimgbc(R.drawable.qa5);
        monAnBanChayModel.setIdtenmonanbc("Ăn vặt Thùy Dương");
        monAnBanChayModel.setIddiachibc("K18/12 Ông Ích Khiêm, TP Đà Nẵng");
        monAnBanChayModel.setIdgiabc("Freeship");
        monanBCData.add(monAnBanChayModel);

        monAnBanChayModel=new MonAnBanChayModel();
        monAnBanChayModel.setId(6);
        monAnBanChayModel.setIdimgbc(R.drawable.qa6);
        monAnBanChayModel.setIdtenmonanbc("Trà Sữa Chú Chim");
        monAnBanChayModel.setIddiachibc("148 Đống Đa, TP Đà Nẵng");
        monAnBanChayModel.setIdgiabc("Mã giảm 15k");
        monanBCData.add(monAnBanChayModel);
    }

}