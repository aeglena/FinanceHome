package com.lenasquare.financehome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.lenasquare.financehome.adapter.CategoryAdapter;
import com.lenasquare.financehome.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "payment_icon" ,   "приход", 120.10, "11.08.2021" ));
        categoryList.add(new Category(2, "shopping" , "Шопинг", -10.10, "11.08.2021" ));
        categoryList.add(new Category(3, "payment_icon" , "приход", 100.10, "11.08.2021" ));
        categoryList.add(new Category(4, "payment_icon" , "приход", 100.00, "11.08.2021" ));
        setCategoryRecyvler(categoryList);
    }

    private void setCategoryRecyvler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        categoryRecycler = findViewById(R.id.category);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

}