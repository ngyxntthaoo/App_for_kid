package com.thnhthao.study2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView phuam_b, phuam_c, phuam_d, phuam_dd;
    CardView phuam_g, phuam_h, phuam_k, phuam_l;
    CardView phuam_m, phuam_n, phuam_p, phuam_q;
    CardView phuam_r, phuam_s, phuam_t, phuam_v, phuam_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phuam_b = findViewById(R.id.cardview_phuam_b);
        phuam_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_d);
                ring.start();
            }
        });
        phuam_c = findViewById(R.id.cardview_phuam_c);
        phuam_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_c);
                ring.start();
            }
        });
        phuam_d = findViewById(R.id.cardview_phuam_d);
        phuam_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_d);
                ring.start();
            }
        });
        phuam_dd = findViewById(R.id.cardview_phuam_dd);
        phuam_dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_dd);
                ring.start();
            }
        });
        phuam_g = findViewById(R.id.cardview_phuam_g);
        phuam_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_g);
                ring.start();
            }
        });
        phuam_h = findViewById(R.id.cardview_phuam_h);
        phuam_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_h);
                ring.start();
            }
        });
        phuam_k = findViewById(R.id.cardview_phuam_k);
        phuam_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_k);
                ring.start();
            }
        });
        phuam_l = findViewById(R.id.cardview_phuam_l);
        phuam_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_l);
                ring.start();
            }
        });
        phuam_m = findViewById(R.id.cardview_phuam_m);
        phuam_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_m);
                ring.start();
            }
        });
        phuam_n = findViewById(R.id.cardview_phuam_n);
        phuam_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_n);
                ring.start();
            }
        });

        phuam_p = findViewById(R.id.cardview_phuam_p);
        phuam_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_p);
                ring.start();
            }
        });
        phuam_q = findViewById(R.id.cardview_phuam_q);
        phuam_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_q);
                ring.start();
            }
        });
        phuam_r = findViewById(R.id.cardview_phuam_r);
        phuam_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_r);
                ring.start();
            }
        });
        phuam_s = findViewById(R.id.cardview_phuam_s);
        phuam_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_s);
                ring.start();
            }
        });
        phuam_t = findViewById(R.id.cardview_phuam_t);
        phuam_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_t);
                ring.start();
            }
        });
        phuam_v = findViewById(R.id.cardview_phuam_v);
        phuam_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_v);
                ring.start();
            }
        });
        phuam_x = findViewById(R.id.cardview_phuam_x);
        phuam_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer ring= MediaPlayer.create(MainActivity.this,R.raw.audio_x);
                ring.start();
            }
        });
    }
}