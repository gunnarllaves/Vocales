package com.example.gunna.vocales;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_a extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_a);

        VideoView video =(VideoView)findViewById(R.id.video_a);
        video.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.aa));
        video.setMediaController(new MediaController(this));
        video.requestFocus();
        video.start();

    }
    public void salir_Video_A(View v){
        finish();
    }
}
