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
        Log.i("logh","main selected");

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
        Log.i("logh","selected");

        Fragment fragment=null;

        switch(menuItem.getItemId()){

            case R.id.navigation_home:
                fragment = new HomeFragment();
                Log.i("logh","home selected");
                break;

            case R.id.navigation_googlegroup:
                fragment = new GooglegroupFragment();
                Log.i("logh","g.grp selected");
                break;

            case R.id.navigation_erp:
                fragment = new ErpFragment();
                Log.i("logh","erp selected");
                break;

            case R.id.navigation_ktu:
                fragment = new KtuFragment();
                Log.i("logh","Ktu selected");
                break;
        }

        return loadFragment(fragment);
    }
}
