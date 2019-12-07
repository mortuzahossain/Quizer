package io.github.mortuzahossain.quizer.sets;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.mortuzahossain.quizer.R;
import io.github.mortuzahossain.quizer.sets.adapter.SetsGridAdapter;

public class SetsActivity extends AppCompatActivity {

    @BindView(R.id.toolbar2)
    Toolbar toolbar;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.gridView)
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(getIntent().getStringExtra("TITLE"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        SetsGridAdapter adapter = new SetsGridAdapter(15);
        gridView.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
