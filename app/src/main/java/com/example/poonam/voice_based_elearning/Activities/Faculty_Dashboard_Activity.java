package com.example.poonam.voice_based_elearning.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.poonam.voice_based_elearning.Fragments.Faculty_Home_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Faculty_Pending_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Faculty_Profile_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Faculty_Quiz_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Faculty_Upload_Fragment;
import com.example.poonam.voice_based_elearning.R;

public class Faculty_Dashboard_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottom_navigation_faculty_dashboard;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_layout_faculty_dashboard);
        bottom_navigation_faculty_dashboard = findViewById(R.id.bottom_navigation_faculty_dashboard);
        bottom_navigation_faculty_dashboard.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if(menuItem.getItemId()==R.id.menu_faculty_home)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faculty_fragment_container,new Faculty_Home_Fragment());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId()==R.id.menu_faculty_pending)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faculty_fragment_container,new Faculty_Pending_Fragment());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId()==R.id.menu_faculty_profile)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faculty_fragment_container,new Faculty_Profile_Fragment());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId()==R.id.menu_faculty_upload)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faculty_fragment_container,new Faculty_Upload_Fragment());
            fragmentTransaction.commit();
        }

        if(menuItem.getItemId()==R.id.menu_faculty_quiz)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.faculty_fragment_container,new Faculty_Quiz_Fragment());
            fragmentTransaction.commit();
        }
        return true;
    }
}
