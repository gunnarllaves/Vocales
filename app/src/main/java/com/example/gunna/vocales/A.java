package com.example.gunna.vocales;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class A extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }
    public void siguiente_texto_A(View v){
        Intent i = new Intent(this,texto_A.class);
        startActivity(i);
    }
    public void salir_texto_A(View v){
        finish();
    }
    public void sigAudio(View v){
        Intent i = new Intent(this,Audio_a.class);
        startActivity(i);
    }
    public void sigVideo(View v){
        Intent i = new Intent(this,Video_a.class);
        startActivity(i);
    }

}
