package com.example.fitnessapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.google.android.material.navigation.NavigationView;


public class HomeFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        NavigationView navigationView =  view.findViewById(R.id.nav_drawer_view);
        navigationView.setNavigationItemSelectedListener(this);
        return view;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.drawer_shop:
                ShopFragment shopFragment = new ShopFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.fragment_container, shopFragment).commit();
                break;
            case R.id.drawer_payment:
                PaymentFragment paymentFragment = new PaymentFragment();
                FragmentManager managerP = getFragmentManager();
                managerP.beginTransaction().replace(R.id.fragment_container, paymentFragment).commit();
                break;
            case R.id.drawer_chat:
                ChatFragment chatFragment = new ChatFragment();
                FragmentManager managerC = getFragmentManager();
                managerC.beginTransaction().replace(R.id.fragment_container, chatFragment).commit();
                break;
            case R.id.drawer_notifications:
                NotificationsFragment notificationsFragment = new NotificationsFragment();
                FragmentManager managerN = getFragmentManager();
                managerN.beginTransaction().replace(R.id.fragment_container, notificationsFragment).commit();
                break;
            case R.id.drawer_settings:
                SettingsFragment settingsFragment = new SettingsFragment();
                FragmentManager managerS = getFragmentManager();
                managerS.beginTransaction().replace(R.id.fragment_container, settingsFragment).commit();
                break;
            case R.id.drawer_rate_us:
                RateUsFragment rateUsFragment = new RateUsFragment();
                FragmentManager managerRU = getFragmentManager();
                managerRU.beginTransaction().replace(R.id.fragment_container, rateUsFragment).commit();
                break;
        }
        return true;
    }
}