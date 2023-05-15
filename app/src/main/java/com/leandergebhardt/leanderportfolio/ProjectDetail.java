package com.leandergebhardt.leanderportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);

        findViews();
        if(getIntent().getExtras() != null) {

        }
    }



    private void findViews(){
        TextView title = findViewById(R.id.text_view_title);
        TextView description = findViewById(R.id.text_view_description);
        ImageView icon = findViewById(R.id.image_view_icon);
    }
}