package io.github.mortuzahossain.quizer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.mortuzahossain.quizer.catagory.CategoryActivity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.btn_start_quiz)
    Button btnStartQuiz;
    @BindView(R.id.btn_bookmarks)
    Button btnBookmarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btn_start_quiz, R.id.btn_bookmarks})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_start_quiz:
                startActivity(new Intent(MainActivity.this, CategoryActivity.class));
                break;
            case R.id.btn_bookmarks:
                break;
        }
    }
}
