package io.github.mortuzahossain.quizer.catagory;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.mortuzahossain.quizer.R;
import io.github.mortuzahossain.quizer.catagory.adapter.CategoryAdapter;
import io.github.mortuzahossain.quizer.catagory.model.CategoryModel;

public class CategoryActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.categoryRecyclerView)
    RecyclerView categoryRecyclerView;

    CategoryAdapter categoryAdapter;
    ArrayList<CategoryModel> categoryModels = new ArrayList<CategoryModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        categoryModels.add(new CategoryModel("Category 1", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 2", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 3", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 4", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 5", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 6", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 7", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 8", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 9", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 10", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 11", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 12", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 13", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 14", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 15", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 16", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));
        categoryModels.add(new CategoryModel("Category 17", "https://www.mountsinai.on.ca/wellbeing/our-team/team-images/person-placeholder/image"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        categoryRecyclerView.setLayoutManager(linearLayoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryModels);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
