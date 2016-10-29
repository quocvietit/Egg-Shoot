package com.example.newworld.eggshootdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/*
 Hiển thị menu:
 */
public class Menu extends AppCompatActivity {
    private Button buttonChoi;
    private Button buttonXepHang;
    private Button buttonGioiThieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.menu);

        buttonChoi = (Button) findViewById(R.id.button_Choi);
        buttonXepHang = (Button) findViewById(R.id.button_XepHang);
        buttonGioiThieu = (Button) findViewById(R.id.button_GioiThieu);
        // Chuyển sang Menu chọn chế độ
        buttonChoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playMode = new Intent(Menu.this,PlayMode.class);
                startActivity(playMode);
            }
        });
        //Chuyển sang giao diện xếp hạng
        buttonXepHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rating = new Intent(Menu.this,Rating.class);
                startActivity(rating);
            }
        });
        //Chuyển sang giao diện giới thiệu
        buttonGioiThieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introduction = new Intent(Menu.this,Introduction.class);
                startActivity(introduction);
            }
        });

    }
}
