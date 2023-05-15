package com.leandergebhardt.leanderportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView projectList = findViewById(R.id.recycle_view_projects);

        Project[] projects = new Project[]{
            new Project(
                "Getting Started",
                "Very first project (Hello World)",
                R.drawable.getting_started
            ),
            new Project(
                    "BMI Calculator",
                    "A functional BMI calculator.",
                    R.drawable.calculator
            ),
            new Project(
                    "Hungry Bits",
                    "A menu app for fictional restaurant, learning Activities, List Views",
                    R.drawable.hungry_developer
            ),new Project(
                    "CV Generator",
                    "Generates Cover Letters for a variety of tech jobs.",
                    R.drawable.cv
            ),
        };


/*
            projectList.setOnClickListener(v -> {
                Intent projectDetailActivityIntent = new Intent(MainActivity.this, ProjectDetail.class);
                startActivity(projectDetailActivityIntent);
                projectDetailActivityIntent.putExtra("projects", projects);
            });

 */


        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        projectList.setAdapter(adapter);
    }
}