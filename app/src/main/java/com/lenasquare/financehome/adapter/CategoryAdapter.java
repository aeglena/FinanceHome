package com.lenasquare.financehome.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lenasquare.financehome.R;
import com.lenasquare.financehome.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    Context context;
    List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new CategoryViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.categoryTitle.setText(categoryList.get(position).getTitle()) ;
        holder.categoryData.setText(categoryList.get(position).getData());
        holder.categoryTotal.setText(categoryList.get(position).getTotal().toString());
        int imageId = context.getResources().getIdentifier("ic_"+ categoryList.get(position).getImg(), "drawable", context.getPackageName());
        holder.categoryView.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static final class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView categoryTitle, categoryTotal, categoryData;
        ImageView categoryView;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryTitle = itemView.findViewById(R.id.categoryItemTitle);
            categoryTotal = itemView.findViewById(R.id.categoryItemTotal);
            categoryData = itemView.findViewById(R.id.categoryItemData);
            categoryView = itemView.findViewById(R.id.categoryView);
        }
    }
}
