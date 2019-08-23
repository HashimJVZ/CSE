package com.hashim.cse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());

    }

    private boolean loadFragment(Fragment fragment) {
        if(fragment != null){

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }

        return false;

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment=null;

        switch(menuItem.getItemId()){

            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_googlegroup:
                fragment = new GooglegroupFragment();
                break;

            case R.id.navigation_erp:
                fragment = new ErpFragment();
                break;

            case R.id.navigation_ktu:
                fragment = new KtuFragment();
                break;
        }

        return loadFragment(fragment);
    }
}
