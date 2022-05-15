package com.thnhthao.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity_tiengviet extends AppCompatActivity {

    ImageView img_back;
    ImageView img_nguyenam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tiengviet);

        img_back = findViewById(R.id.ic_arrow_back);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manhinh_main = new Intent(MainActivity_tiengviet.this, MainActivity.class);
                startActivity(manhinh_main);
            }
        });

        /*img_nguyenam = findViewById(R.id.cardview_nguyenam);
        img_nguyenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manhinh_nguyenam = new Intent(MainActivity_tiengviet.this, MainActivity_nguyenam.class);
                startActivity(manhinh_nguyenam);

            }
        });*/
    }
}