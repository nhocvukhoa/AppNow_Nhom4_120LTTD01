package com.example.now1.home.Tab.gantoi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class CustomAdapterGanToi extends BaseAdapter {

    Context context;
    ArrayList<MonAnGanToiModel> monangtData;
    LayoutInflater layoutInflater;
    MonAnGanToiModel monAnGanToiModel;

    public CustomAdapterGanToi(Context context, ArrayList<MonAnGanToiModel> monangtData) {
        this.monangtData = monangtData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return monangtData.size();
    }

    @Override
    public Object getItem(int i) {
        return monangtData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return monangtData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row_listgantoi, null, true);
        }
        //link views
        ImageView imggt = rowView.findViewById(R.id.idimggt);
        TextView idtenmonangt = rowView.findViewById(R.id.idtenmonangt);
        TextView iddiachigt = rowView.findViewById(R.id.iddiachigt);
        TextView idgiagt = rowView.findViewById(R.id.idgiagt);

        monAnGanToiModel = monangtData.get(position);

        imggt.setImageResource(monAnGanToiModel.getIdimggt());
        idtenmonangt.setText(monAnGanToiModel.getIdtenmonangt());
        idgiagt.setText(monAnGanToiModel.getIdgiagt());
        iddiachigt.setText(monAnGanToiModel.getIddiachigt());

        return rowView;
    }

}
