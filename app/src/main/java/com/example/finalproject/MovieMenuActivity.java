package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieMenuActivity extends AppCompatActivity
{
    private TextView movie1, movie2, movie3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_menu);
        movie1 = findViewById(R.id.movie1);
        movie2 = findViewById(R.id.movie2);
        movie3 = findViewById(R.id.movie3);
        movie1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MovieMenuActivity.this, ViewMore1Activity.class));
            }
        });
        movie2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MovieMenuActivity.this, ViewMore2Activity.class));
            }
        });
        movie3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MovieMenuActivity.this, ViewMore3Activity.class));
            }
        });
    }
}
