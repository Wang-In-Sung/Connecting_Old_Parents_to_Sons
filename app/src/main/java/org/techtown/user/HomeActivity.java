package org.techtown.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class HomeActivity extends AppCompatActivity {
    private Button btn_hospital_plan, btn_AI_voice_service, btn_medicine,
            btn_caregiver, btn_mental_health, btn_calendar;
    private Button drawer_btn_hospital_plan, drawer_btn_AI_voice_service, drawer_btn_medicine,
            drawer_btn_caregiver, drawer_btn_mental_health, drawer_btn_calendar;

    private Button btn_menu;
    private DrawerLayout drawerLayout;
    private View drawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar mytoolbar = findViewById(R.id.mytoolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //click drawer
        btn_menu = findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(drawerView);
            }
        });
        // drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.Home);
        drawerView = (View) findViewById(R.id.drawerView);
        drawerLayout.setDrawerListener(listener);

        drawer_btn_hospital_plan = findViewById(R.id.drawer_btn_hospital_plan);
        /*drawer_btn_AI_voice_service = findViewById(R.id.drawer_btn_AI_voice_service);
        drawer_btn_medicine = findViewById(R.id.drawer_btn_medicine);
        drawer_btn_caregiver = findViewById(R.id.drawer_btn_caregiver);
        drawer_btn_mental_health = findViewById(R.id.drawer_btn_mental_health);
        drawer_btn_calendar = findViewById(R.id.drawer_btn_calendar);*/

        drawer_btn_hospital_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HospitalPlanActivity.class);
                startActivity((intent));
            }
        });

        // content
        btn_hospital_plan = findViewById(R.id.btn_hospital_plan);
        /*btn_AI_voice_service = findViewById(R.id.btn_AI_voice_service);
        btn_medicine = findViewById(R.id.btn_medicine);
        btn_caregiver = findViewById(R.id.btn_caregiver);
        btn_mental_health = findViewById(R.id.btn_mental_health);
        btn_calendar = findViewById(R.id.btn_calendar);*/

        btn_hospital_plan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HospitalPlanActivity.class);
                startActivity(intent);
            }
        });

        /*btn_AI_voice_service.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HospitalPlanActivity.class);
                startActivity((intent));
            }
        }));

        btn_medicine.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity((intent));
            }
        }));
        btn_caregiver.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity((intent));
            }
        }));

        btn_mental_health.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity((intent));
            }
        }));

        btn_calendar.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity((intent));
            }
        }));*/
    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
        }

        @Override
        public void onDrawerOpened(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerClosed(@NonNull View drawerView) {
        }

        @Override
        public void onDrawerStateChanged(int newState) {
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                Toast.makeText(HomeActivity.this, "로그아웃", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.userprofile:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}