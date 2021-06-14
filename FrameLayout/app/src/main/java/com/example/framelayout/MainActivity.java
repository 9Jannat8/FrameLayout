package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView backImgView, picImgview, musicImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backImgView = findViewById(R.id.backgroundImagId);
        picImgview = findViewById(R.id.pic1ImgId);
        musicImgView = findViewById(R.id.musicImgId);

        backImgView.setOnClickListener(this);
        picImgview.setOnClickListener(this);
        musicImgView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.backgroundImagId){
            backImgView.setVisibility(v.GONE);
            musicImgView.setVisibility(v.VISIBLE);
        }
        if (v.getId() == R.id.musicImgId){
            musicImgView.setVisibility(v.GONE);
            picImgview.setVisibility(v.VISIBLE);
        }
        if (v.getId() == R.id.pic1ImgId){
            picImgview.setVisibility(v.GONE);
            backImgView.setVisibility(v.VISIBLE);
        }
    }
}