package com.example.lenovo.newgame.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.lenovo.newgame.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.basic)
    ImageButton learn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, newLevel.class);
                startActivity(intent);
            }
        });


    }
//
//    public void easylevel(View view) {
//        Intent intent = new Intent(HomeActivity.this, easyLevel.class);
//        startActivity(intent);
//    }
}
