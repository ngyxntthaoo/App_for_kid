package com.thnhthao.nguyenam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView nguyenam_a, nguyenam_aw, nguyenam_aa;
    CardView nguyenam_e, nguyenam_ee, nguyenam_i, nguyenam_y;
    CardView nguyenam_o, nguyenam_oo, nguyenam_ow;
    CardView nguyenam_u, nguyenam_uw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nguyenam_a = findViewById(R.id.cardview_nguyenam_a);
        nguyenam_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_a);
                ring.start();
            }
        });
        nguyenam_aw = findViewById(R.id.cardview_nguyenam_aw);
        nguyenam_aw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_aw);
                ring.start();
            }
        });
        nguyenam_aa = findViewById(R.id.cardview_nguyenam_aa);
        nguyenam_aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_aa);
                ring.start();
            }
        });
        nguyenam_e = findViewById(R.id.cardview_nguyenam_e);
        nguyenam_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_e);
                ring.start();
            }
        });
        nguyenam_ee = findViewById(R.id.cardview_nguyenam_ee);
        nguyenam_ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_ee);
                ring.start();
            }
        });
        nguyenam_i = findViewById(R.id.cardview_nguyenam_i);
        nguyenam_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_i);
                ring.start();
            }
        });
        nguyenam_y = findViewById(R.id.cardview_nguyenam_y);
        nguyenam_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_i);
                ring.start();
            }
        });
        nguyenam_o = findViewById(R.id.cardview_nguyenam_o);
        nguyenam_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_o);
                ring.start();
            }
        });
        nguyenam_oo = findViewById(R.id.cardview_nguyenam_oo);
        nguyenam_oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_oo);
                ring.start();
            }
        });
        nguyenam_ow = findViewById(R.id.cardview_nguyenam_ow);
        nguyenam_ow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_ow);
                ring.start();
            }
        });

        nguyenam_u = findViewById(R.id.cardview_nguyenam_u);
        nguyenam_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_u);
                ring.start();
            }
        });
        nguyenam_uw = findViewById(R.id.cardview_nguyenam_uw);
        nguyenam_uw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_uw);
                ring.start();
            }
        });
    }
}