package com.example.newworld.eggshootdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;

/*
Hiển thị giao diện chọn độ khó
 */
public class Level extends Activity {
     Button buttonDe;
     Button buttonVua;
     Button buttonKho;
    Play play;
    private static final String TAG = Level.class.getSimpleName();
    @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            Map.initMaps();
            play = new Play(this);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.level);

        buttonDe = (Button) findViewById(R.id.button_De);
        buttonVua = (Button) findViewById(R.id.button_Vua);
        buttonKho = (Button) findViewById(R.id.button_Kho);


        buttonDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play.levelN=1;
                Play.reInit();
                setContentView(play);
            }
        });

        buttonVua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play.levelN=2;
                Play.reInit();
                setContentView(play);
            }
        });

        buttonKho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Play.levelN=3;
                Play.reInit();
                setContentView(play);
            }
        });
        //        setContentView(new GameScreen(this));


        Log.d(TAG, "View added");
    }



    @Override
    protected void onDestroy() {
        Log.d(TAG, "Destroying...");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "Stopping...");
        super.onStop();
    }
}
