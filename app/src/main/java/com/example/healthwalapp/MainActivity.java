package com.example.healthwalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        if (toolbar != null)
            setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drwaer_layout);
        navigationView=(NavigationView)findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch(id){
            case R.id.home:
            Toast.makeText(this, "This is home", Toast.LENGTH_SHORT).show();
            Intent intent1=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent1);
            break;
            case R.id.dos:
            Intent intent2=new Intent(MainActivity.this,DosActivity.class);
            startActivity(intent2);
            Toast.makeText(this, "This is to do", Toast.LENGTH_SHORT).show();
            break;
            case R.id.donts:
            Intent intent3=new Intent(MainActivity.this,DontsActivity.class);
            startActivity(intent3);
            Toast.makeText(this, "This is not to be done", Toast.LENGTH_SHORT).show();
            break;
            case R.id.quiz:
                Intent intent4=new Intent(MainActivity.this,QuestionActivity.class);
                startActivity(intent4);
                Toast.makeText(this, "Take the quiz", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hands:
                Intent intent5=new Intent(MainActivity.this,timerActivity.class);
                startActivity(intent5);
                Toast.makeText(this, "wash your hands", Toast.LENGTH_SHORT).show();
                break;
            case R.id.medical_stores:
                Intent intent6 =new Intent(MainActivity.this,googleMapsActivity.class);
                startActivity(intent6);
                Toast.makeText(this, "search nearby medical stores", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
