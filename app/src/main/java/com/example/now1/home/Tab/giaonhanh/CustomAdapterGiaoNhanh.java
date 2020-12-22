package com.example.now1.home.Tab.giaonhanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class CustomAdapterGiaoNhanh extends BaseAdapter {

    Context context;
    ArrayList<MonAnGiaoNhanhModel> monangnData;
    LayoutInflater layoutInflater;
    MonAnGiaoNhanhModel monAnGiaoNhanhModel;

    public CustomAdapterGiaoNhanh(Context context, ArrayList<MonAnGiaoNhanhModel> monangnData) {
        this.monangnData = monangnData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return monangnData.size();
    }

    @Override
    public Object getItem(int i) {
        return monangnData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return monangnData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row_listgiaonhanh, null, true);
        }
        //link views
        ImageView imggn = rowView.findViewById(R.id.idimggn);
        TextView idtenmonangn = rowView.findViewById(R.id.idtenmonangn);
        TextView iddiachign = rowView.findViewById(R.id.iddiachign);
        TextView idgiagn = rowView.findViewById(R.id.idgiagn);

        monAnGiaoNhanhModel = monangnData.get(position);

        imggn.setImageResource(monAnGiaoNhanhModel.getIdimggn());
        idtenmonangn.setText(monAnGiaoNhanhModel.getIdtenmonangn());
        idgiagn.setText(monAnGiaoNhanhModel.getIdgiagn());
        iddiachign.setText(monAnGiaoNhanhModel.getIddiachign());

        return rowView;
    }

}
