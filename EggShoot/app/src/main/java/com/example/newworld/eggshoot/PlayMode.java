package com.example.newworld.eggshoot;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class PlayMode extends AppCompatActivity {
    private Button button_CoDien;
    private Button button_ThoiGian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //full sreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_play_mode);

        button_CoDien = (Button)findViewById(R.id.button_CoDien);
        button_ThoiGian = (Button)findViewById(R.id.button_ThoiGian);

        button_CoDien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level = new Intent(PlayMode.this, Level.class);
                level.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(level);
            }
        });

        button_ThoiGian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level = new Intent(PlayMode.this, Level.class);
                level.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(level);
            }
        });
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getActionBar().setDisplayHomeAsUpEnabled(false);
    }


}
