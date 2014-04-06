package com.team.innovation;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.*;;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        cfg.useAccelerometer = true;
        cfg.useCompass = true;
        
        initialize(new Main_Game_Class(), cfg);
    }
}