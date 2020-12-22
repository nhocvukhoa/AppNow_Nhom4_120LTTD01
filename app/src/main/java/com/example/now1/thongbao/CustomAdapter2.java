package com.example.now1.thongbao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {

    Context context;
    LinearLayout ln;
    ArrayList<TinhTrangModel> tinhtrangData;
    LayoutInflater layoutInflater;
    TinhTrangModel tinhtrangModel;

    public CustomAdapter2(Context context, ArrayList<TinhTrangModel> tinhtrangData) {
        this.context = context;
        this.tinhtrangData = tinhtrangData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return tinhtrangData.size();
    }

    @Override
    public Object getItem(int i) {
        return tinhtrangData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return tinhtrangData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = view;
        if (rowView == null) {
            rowView = layoutInflater.inflate(R.layout.list_tinhtrang, null, true);
        }
        //link views
        ImageView avata2 = rowView.findViewById(R.id.avata2);
        TextView tieude2 = rowView.findViewById(R.id.tieude2);
        TextView noidung2 = rowView.findViewById(R.id.noidung2);
        TextView time = rowView.findViewById(R.id.time);


       tinhtrangModel = tinhtrangData.get(position);

        avata2.setImageResource(tinhtrangModel.getAvata2());
        tieude2.setText(tinhtrangModel.getTieude2());
        noidung2.setText(tinhtrangModel.getNoidung2());
        time.setText(tinhtrangModel.getTime());

        return rowView;
    }

//    public void RemoveItem(int position) {
//        profileData.remove(position);
//        notifyDataSetChanged();
//    }

}