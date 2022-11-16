package com.example.productlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.myListofProducts);
        String [] imagesofproduct=getResources().getStringArray(R.array.idimages);
        float [] prix= new float[]{14,45,30,78,45,56,100};
        String [] names=getResources().getStringArray(R.array.names);
        TypedArray images=getResources().obtainTypedArray(R.array.idimages);


        ArrayList<Product> products=new ArrayList<>();
        for(int i=0;i<7;i++){
            products.add(new Product(names[i],prix[i],images.getResourceId(i,0)));
        }

        ProductAdapter adapter=new ProductAdapter(this,R.layout.costum_layout,products);
        lv.setAdapter(adapter);
    }
}