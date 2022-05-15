package com.thnhthao.myapplication;

import static android.util.Log.i;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout_home;
    NavigationView navigationView_home;
    ActionBarDrawerToggle toggle;
    CardView cardView_tiengviet;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        drawerLayout_home = findViewById(R.id.main_drawlayout);
        navigationView_home = findViewById(R.id.navigatioview);

        toggle = new ActionBarDrawerToggle(this, drawerLayout_home, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout_home.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.yellow)));

        navigationView_home.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_hoso:
                        Log:i("MENU_DRAWER_TAG","Hồ sơ item is click");
                        drawerLayout_home.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_quatrinh:
                        Log:i("MENU_DRAWER_TAG","Quá trình item is click");
                        drawerLayout_home.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_danhgia:
                        Log:i("MENU_DRAWER_TAG","Đánh giá item is click");
                        drawerLayout_home.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_meohoctot:
                        Log:i("MENU_DRAWER_TAG","Mẹo học tốt item is click");
                        drawerLayout_home.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_trogiup:
                        Log:i("MENU_DRAWER_TAG","Trợ giúp item is click");
                        drawerLayout_home.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });



        cardView_tiengviet = findViewById(R.id.cardview_tiengviet);
        cardView_tiengviet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh_tiengviet = new Intent(MainActivity.this, MainActivity_tiengviet.class);
                startActivity(mh_tiengviet);
            }
        });

    }
}