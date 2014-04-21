package com.team.innovation;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.*;;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = true;
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        int checkH = 0;
        TIM tim = new TIM();
        MainMenuScreen mms = new MainMenuScreen(tim);
        
       //initialize(tim, cfg);
       //checkH = mms.check;
        
       initialize(new Main_Game_Class(), cfg);
   
    }

}