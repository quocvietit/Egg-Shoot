package com.example.newworld.eggshoot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button button_Choi;
    private Button button_XepHang;
    private Button button_GioiThieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); // full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);

        button_Choi = (Button)findViewById(R.id.button_Choi);
        button_XepHang = (Button)findViewById(R.id.button_XepHang);
        button_GioiThieu = (Button)findViewById(R.id.button_GioiThieu);

        button_Choi.setOnClickListener(new View.OnClickListener() { //set onclick
            @Override
            public void onClick(View v) {
                Intent play_mode = new Intent(Menu.this,PlayMode.class);
                startActivity(play_mode);
            }
        });

        button_XepHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rating = new Intent(Menu.this,Rating.class);
                startActivity(rating);
            }
        });

        button_GioiThieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent introduction  = new Intent(Menu.this,Introduction.class);
                startActivity(introduction );
            }
        });


    }
}
