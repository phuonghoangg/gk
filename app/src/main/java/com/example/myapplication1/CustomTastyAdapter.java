package com.example.myapplication1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomTastyAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Tasty> arrayList;
    Button btnMove;


    public CustomTastyAdapter(Context ctx, int layoutItem, ArrayList<Tasty> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
       return  arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.textView);
        TextView tvDes = view.findViewById(R.id.textView2);
        TextView tvPrice = view.findViewById(R.id.textView3);
        ImageView imgDonut = view.findViewById(R.id.imageView2);
        btnMove = view.findViewById(R.id.button_move);

        tvName.setText(arrayList.get(i).getNameDonut());
        tvDes.setText(arrayList.get(i).getDesDonut());
        tvPrice.setText(arrayList.get(i).getPrice());
        imgDonut.setImageResource(arrayList.get(i).getImgDonut());

        return  view;
    }
}
