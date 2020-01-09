package com.example.xilofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nota_do_bajo(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.do_bajo);
        mp.start();
    }
    public void nota_re(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.re);
        mp.start();
    }
    public void nota_mi(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.mi);
        mp.start();
    }
    public void nota_fa(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.fa);
        mp.start();
    }
    public void nota_sol(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sol);
        mp.start();
    }
    public void nota_la(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.la);
        mp.start();
    }
    public void nota_si(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.si);
        mp.start();
    }
    public void nota_do_alto(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.do_alto);
        mp.start();
    }

}
