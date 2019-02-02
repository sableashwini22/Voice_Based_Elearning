package com.example.poonam.voice_based_elearning.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.poonam.voice_based_elearning.Fragments.Student_Favorite_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Student_Home_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Student_Notification_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Student_Profile_Fragment;
import com.example.poonam.voice_based_elearning.Fragments.Student_Quize_Fragment;
import com.example.poonam.voice_based_elearning.R;

public class Student_Dashboard_Activity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView student_bottom_navigation_dashboard;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_student_dashboard);

        student_bottom_navigation_dashboard=findViewById(R.id.bottom_navigation_student_dashboard);
        student_bottom_navigation_dashboard.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId()==R.id.navigation_student_home)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.student_fragment_container,new Student_Home_Fragment());
            fragmentTransaction.commit();

        }

        if (menuItem.getItemId()==R.id.navigation_student_profile)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.student_fragment_container,new Student_Profile_Fragment());
            fragmentTransaction.commit();

        }
        if (menuItem.getItemId()==R.id.navigation_student_notification)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.student_fragment_container,new Student_Notification_Fragment());
            fragmentTransaction.commit();

        }
        if (menuItem.getItemId()==R.id.navigation_student_favorite)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.student_fragment_container,new Student_Favorite_Fragment());
            fragmentTransaction.commit();

        }
        if (menuItem.getItemId()==R.id.navigation_student_quize)
        {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.student_fragment_container,new Student_Quize_Fragment());
            fragmentTransaction.commit();

        }
        return true;


        }
}
