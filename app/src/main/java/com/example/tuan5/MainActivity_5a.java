package com.example.tuan5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tuan5.adapter.ProductAdapter;
import com.example.tuan5.model.Product;

import java.util.ArrayList;

public class MainActivity_5a extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Product> products;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_5a);

        listView = findViewById(R.id.listView);

        products = new ArrayList<>();
        products.add(new Product("Tasty Donut","Spicy tasty donut family",R.drawable.donut_yellow,10.00));
        products.add(new Product("Pink Donut","Spicy tasty donut family",R.drawable.tasty_donut, 20.00));
        products.add(new Product("Floating Donut","Spicy tasty donut family",R.drawable.green_donut, 30.00));
        products.add(new Product("Tasty Donut","Spicy tasty donut family",R.drawable.donut_red, 40.00));
        products.add(new Product("Tasty Donut","Spicy tasty donut family",R.drawable.tasty_donut, 30.00));

        adapter = new ProductAdapter(this,R.layout.item_listview,products);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity_5a.this, MainActivity_5b.class);
                Bundle b = new Bundle();
                b.putString("name", products.get(position).getName());
                b.putString("note", products.get(position).getHang());
                b.putDouble("money", products.get(position).getGia());
                b.putInt("img", products.get(position).getImage());
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}