package com.example.productlistview;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ProductAdapter extends BaseAdapter {

    Context c;
    int resource;
    ArrayList<Product> products;

    public ProductAdapter(Context c, int resource, ArrayList<Product> products){
        this.c=c;
        this.resource=resource;
        this.products=products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Product getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        if(v==null){
            v= LayoutInflater.from(c).inflate(resource,null,false);
        }
        TextView name=v.findViewById(R.id.product_Name);
        TextView price=v.findViewById(R.id.product_price);
        ImageView image=v.findViewById(R.id.image_product);

        Product p=getItem(i);
        name.setText(p.getP_intitule());
        price.setText(String.valueOf(p.getP_prix()));

        image.setImageResource(p.getUrl());

        return v;
    }
}
