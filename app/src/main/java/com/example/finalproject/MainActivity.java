package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView newMove;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newMove = findViewById(R.id.newMove);//获取界面控件Id
        newMove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {//点击进行跳转
                startActivity(new Intent(MainActivity.this, MovieMenuActivity.class));
            }
        });

    }
}
