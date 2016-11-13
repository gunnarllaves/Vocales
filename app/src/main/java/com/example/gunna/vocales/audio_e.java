package com.example.gunna.vocales;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class audio_e extends Activity implements View.OnClickListener {
    Button iniciar,parar;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_e);

        iniciar=(Button)findViewById(R.id.inicio);
        parar=(Button)findViewById(R.id.parar);
        mp= MediaPlayer.create(this,R.raw.e);

        iniciar.setOnClickListener(this);
        parar.setOnClickListener(this);
    }
    public void salirAudio_e(View v){
        finish();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.inicio:
                mp.start();
                break;
            case R.id.parar:
                mp.stop();
        }
    }
}

