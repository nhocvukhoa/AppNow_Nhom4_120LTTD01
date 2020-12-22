package com.example.now1.home.bosuutap1.GridBoSuuTap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.now1.R;

import java.util.ArrayList;

public class BoSuuTapGridAdapter extends BaseAdapter {
    Context context;
    ArrayList<ListBoSuuTapModel> productsData;
    LayoutInflater layoutInflater;
    ListBoSuuTapModel productModel;

    public BoSuuTapGridAdapter(Context context, ArrayList<ListBoSuuTapModel> productData) {
        this.context = context;
        this.productsData = productData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return productsData.size();
    }

    @Override
    public Object getItem(int i) {
        return productsData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productsData.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;
        if (view1==null) {
            view1 = layoutInflater.inflate(R.layout.row_gridbosuutap,null, true);
        }
        //getting view in row_data
        TextView name = view1.findViewById(R.id.idnamechinh);
        ImageView image = view1.findViewById(R.id.imageViewbst);

        productModel = productsData.get(position);

        name.setText(productModel.getNamebst());
        image.setImageResource(productModel.getImagebst());
        return view1;
    }
}
