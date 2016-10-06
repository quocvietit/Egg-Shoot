package com.example.newworld.eggshootdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/*
Hiển thị giao diện chọn độ khó
 */
public class Level extends AppCompatActivity {
    private Button buttonDe;
    private Button buttonVua;
    private Button buttonKho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.level);

        buttonDe = (Button) findViewById(R.id.button_De);
        buttonVua = (Button) findViewById(R.id.button_Vua);
        buttonKho = (Button) findViewById(R.id.button_Kho);

        buttonDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Level.this,Play.class);
                startActivity(play);
            }
        });

        buttonVua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Level.this,Play.class);
                startActivity(play);
            }
        });

        buttonKho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent(Level.this,Play.class);
                startActivity(play);
            }
        });
    }
}
