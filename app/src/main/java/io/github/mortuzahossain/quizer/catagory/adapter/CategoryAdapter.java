package io.github.mortuzahossain.quizer.catagory.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import io.github.mortuzahossain.quizer.R;
import io.github.mortuzahossain.quizer.catagory.model.CategoryModel;
import io.github.mortuzahossain.quizer.sets.SetsActivity;

/**
 * Created by Mortuza Hossain on 07-Dec-2019
 * Email : mortuzahossain1997@gmail.com
 **/
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CatagoryViewHolder> {

    private ArrayList<CategoryModel> categoryModels;
    private Context context;

    public CategoryAdapter(Context context, ArrayList<CategoryModel> categoryModels) {
        this.categoryModels = categoryModels;
        this.context = context;
    }

    @NonNull
    @Override
    public CatagoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catagory_item, parent, false);
        return new CatagoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatagoryViewHolder holder, int position) {
        holder.title.setText(categoryModels.get(position).getTitle());
        if (categoryModels.get(position).getImage_url() != null && !categoryModels.get(position).getImage_url().isEmpty()) {
            Picasso.get()
                    .load(categoryModels.get(position).getImage_url())
                    .fit()
                    .noFade()
                    .into(holder.ivImage);
        } else {
            holder.ivImage.setImageDrawable(ContextCompat.getDrawable(context, R.color.colorPrimary));
        }
        holder.single_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SetsActivity.class);
                intent.putExtra("TITLE", categoryModels.get(position).getTitle());
                context.startActivity(intent);
                Toast.makeText(context, "Clicked " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryModels.size();
    }

    class CatagoryViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        CircleImageView ivImage;
        LinearLayout single_category;

        public CatagoryViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            ivImage = itemView.findViewById(R.id.image_view);
            single_category = itemView.findViewById(R.id.single_category);
        }
    }
}
