package com.example.now1.daluu.tabchitietquananyeuthich.giaohang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class DatDonAdapter extends BaseAdapter {

    Context context;
    ArrayList<DatDonModel> datdonData;
    LayoutInflater layoutInflater;
    DatDonModel datdonModel;

    public DatDonAdapter(Context context, ArrayList<DatDonModel> datdonData) {
        this.context = context;
        this.datdonData = datdonData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datdonData.size();
    }

    @Override
    public Object getItem(int i) {
        return  datdonData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return  datdonData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.list_datdon, null, true);
        }
        //link views
        ImageView avata = rowView.findViewById(R.id.avata);
        TextView ten= rowView.findViewById(R.id.ten);
        TextView mota1= rowView.findViewById(R.id.mota1);
        TextView mota2= rowView.findViewById(R.id.mota2);
        TextView gia= rowView.findViewById(R.id.gia);
        ImageView them = rowView.findViewById(R.id.them);


        datdonModel= datdonData.get(position);

        avata.setImageResource( datdonModel.getAvata());
        ten.setText( datdonModel.getTen());
        mota1.setText( datdonModel.getMota1());
        mota2.setText( datdonModel.getMota2());
        gia.setText( datdonModel.getGia());
        them.setImageResource(datdonModel.getThem());


        return rowView;
    }
}