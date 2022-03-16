package com.example.tuan5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tuan5.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_5b extends AppCompatActivity {
    TextView txtName, txtHang, txtMoney;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_5b);
        txtName = findViewById(R.id.txtName);
        txtHang = findViewById(R.id.txtNote);
        txtMoney = findViewById(R.id.txtMoney);
        img = findViewById(R.id.imgHinh);

        Intent i = getIntent();
        Bundle b = i.getExtras();
        txtName.setText(b.getString("name"));
        txtMoney.setText(b.getString("money"));
        txtHang.setText(b.getString("note"));
        img.setImageResource(b.getInt("img"));
    }
}