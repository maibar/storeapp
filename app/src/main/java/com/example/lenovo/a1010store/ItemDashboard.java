package com.example.lenovo.a1010store;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ItemDashboard extends AppCompatActivity {

    List<Item> aItem;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.navigation_feed:
                    mTextMessage.setText(R.string.title_feed);
                    return true;
                case R.id.navigation_contact:
                    mTextMessage.setText(R.string.title_contact);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_dashboard);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        aItem = new ArrayList<>();
        aItem.add(new Item("Wukong i8 Smart Ac Partner","rare","RM 189.00",R.drawable.wukongi8));
        aItem.add(new Item("Wukong i8 Plus Smart Ac Partner","rare","RM 239.00",R.drawable.wukongi8plus));
        aItem.add(new Item("Smart AC Partner European Basic Version","rare","RM 171.00",R.drawable.partnerversion));
        aItem.add(new Item("Wukong i8 Smart AC Partner","rare","RM 351.00",R.drawable.wukongi8));
        aItem.add(new Item("Wukong i8 Machee Smart","rare","RM 289.00",R.drawable.wukongi8plus));
        aItem.add(new Item("iWulink S1 USB Mini","rare","RM 351.00",R.drawable.iwulink));
        RecyclerView myrv = (RecyclerView) findViewById(R.id.details_item);
        ItemAdapter myAdapter = new ItemAdapter(this,aItem);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);

    }

}
