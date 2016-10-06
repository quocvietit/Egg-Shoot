package com.example.newworld.eggshootdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/*
Hiển thị giao diện chọn chế độ chơi
 */
public class PlayMode extends AppCompatActivity {
    private Button buttonThoiGian;
    private Button buttonCoDien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.play_mode);

        buttonCoDien = (Button) findViewById(R.id.button_CoDien);
        buttonThoiGian = (Button) findViewById(R.id.button_ThoiGian);

        buttonCoDien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level = new Intent(PlayMode.this,Level.class);
                startActivity(level);
            }
        });

    }
}
