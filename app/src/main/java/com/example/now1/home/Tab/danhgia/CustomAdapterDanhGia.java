package com.example.now1.home.Tab.danhgia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class CustomAdapterDanhGia extends BaseAdapter {

    Context context;
    ArrayList<MonAnDanhGiaModel> monanDGData;
    LayoutInflater layoutInflater;
    MonAnDanhGiaModel monAnDanhGiaModel;

    public CustomAdapterDanhGia(Context context, ArrayList<MonAnDanhGiaModel> monanDGData) {
        this.monanDGData = monanDGData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return monanDGData.size();
    }

    @Override
    public Object getItem(int i) {
        return monanDGData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return monanDGData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row_listdanhgia, null, true);
        }
        //link views
        ImageView imgdg = rowView.findViewById(R.id.idimgdg);
        TextView idtenmonandg = rowView.findViewById(R.id.idtenmonandg);
        TextView iddiachidg = rowView.findViewById(R.id.iddiachidg);
        TextView idgiadg = rowView.findViewById(R.id.idgiadg);

        monAnDanhGiaModel = monanDGData.get(position);

        imgdg.setImageResource(monAnDanhGiaModel.getIdimgdg());
        idtenmonandg.setText(monAnDanhGiaModel.getIdtenmonandg());
        idgiadg.setText(monAnDanhGiaModel.getIdgiadg());
        iddiachidg.setText(monAnDanhGiaModel.getIddiachidg());

        return rowView;
    }

}
