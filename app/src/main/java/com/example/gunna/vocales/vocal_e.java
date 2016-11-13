package com.example.gunna.vocales;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class vocal_e extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocal_e);
    }

    public void siguiente_audio_E(View v) {
        Intent i = new Intent(this,audio_e.class);
        startActivity(i);
    }
    public void salir_E(View v){
        finish();
    }
    public void siguiente_texto_E(View v) {
        Intent i = new Intent(this,texto_e.class);
        startActivity(i);
    }
    public void siguiente_video_E(View v) {
        Intent i = new Intent(this,video_e.class);
        startActivity(i);
    }
}