package com.example.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class ImaginiActivity extends AppCompatActivity
{

    /*private DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        getSupportActionBar().hide();

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);


    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
       *//* if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }*//*
        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                return true;

            case R.id.images: {
                Toast.makeText(ImaginiActivity.this, "Images Selected", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, ImaginiActivity.class);
                startActivity(intent1);
                return true;

            }
            case R.id.quiz: {
                Toast.makeText(ImaginiActivity.this, "Quiz Selected", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, RegisterActivity.class);
                startActivity(intent2);
                return true;

            }

        }
        return drawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }*/

}
