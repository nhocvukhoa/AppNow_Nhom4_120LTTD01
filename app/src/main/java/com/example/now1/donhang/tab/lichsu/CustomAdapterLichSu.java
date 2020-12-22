package com.example.now1.donhang.tab.lichsu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class CustomAdapterLichSu extends BaseAdapter {

    Context context;
    ArrayList<MonAnModel> monanData;
    LayoutInflater layoutInflater;
    MonAnModel monAnModel;

    public CustomAdapterLichSu(Context context, ArrayList<MonAnModel> monanData) {
        this.monanData = monanData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return monanData.size();
    }

    @Override
    public Object getItem(int i) {
        return monanData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return monanData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.row_listlichsu, null, true);
        }
        //link views
        ImageView imgls = rowView.findViewById(R.id.idimglichsu);
        TextView idmonan = rowView.findViewById(R.id.idmonan);
        TextView idtenmonanls = rowView.findViewById(R.id.idtenmonanlichsu);
        TextView iddiachils = rowView.findViewById(R.id.iddiachilichsu);
        TextView idgials = rowView.findViewById(R.id.idgialichsu);
        TextView idlich = rowView.findViewById(R.id.idlichlichsu);

        monAnModel = monanData.get(position);

        imgls.setImageResource(monAnModel.getIdimglichsu());
        idmonan.setText(monAnModel.getIdmonan());
        idtenmonanls.setText(monAnModel.getIdtenmonan());
        idlich.setText(monAnModel.getIdlichlichsu());
        idgials.setText(monAnModel.getIdgialichsu());
        iddiachils.setText(monAnModel.getIddiachilichsu());

        return rowView;
    }

}
