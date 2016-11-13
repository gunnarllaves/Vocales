package com.example.gunna.vocales;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void salir(View v) {
        finish();
    }

    public void siguiente_A(View v) {
        Intent i = new Intent(this, A.class);
        startActivity(i);

    }
    public void siguiente_U(View v) {
        Intent i = new Intent(this, Vocal_u.class);
        startActivity(i);

    }

    public void siguiente_video_principal(View v) {
        Intent i = new Intent(this, Video_principal.class);
        startActivity(i);

    }

    public void siguiente_E(View v) {
        Intent i = new Intent(this, vocal_e.class);
        startActivity(i);
    }

    public void siguiente_I(View v) {
        Intent i = new Intent(this,Vocal_i.class);
        startActivity(i);
    }
    public void siguiente_O(View v) {
        Intent i = new Intent(this,Vocal_o.class);
        startActivity(i);
    }
}
