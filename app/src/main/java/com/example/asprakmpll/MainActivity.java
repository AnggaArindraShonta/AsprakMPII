package com.example.asprakmpll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asprakmpll.Activity.Explicit.FirstActivity;
import com.example.asprakmpll.Activity.Implicit.ImplicitIntentActivity;
import com.example.asprakmpll.Activity.Passing.InputActivity;
import com.example.asprakmpll.RoomDatabase.Data.Model.Mahasiswa;
import com.example.asprakmpll.RoomDatabase.Data.common.DataListListener;
import com.example.asprakmpll.RoomDatabase.UI.AddRoomDataActivity;
import com.example.asprakmpll.RoomDatabase.UI.CrudActivity;
import com.example.asprakmpll.RoomDatabase.UI.HomeActivity;
import com.example.asprakmpll.RoomDatabase.UI.RoomDataActivity;
import com.example.asprakmpll.RoomDatabase.UI.WithFragmentActivity;

public class MainActivity extends AppCompatActivity {

    Button explicit, implicit, intent, roomdb, bottomnav, fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicit = findViewById(R.id.btnExplicit);
        implicit = findViewById(R.id.btnImplicit);
        intent = findViewById(R.id.btnIntent);
        roomdb = findViewById(R.id.btnRoomDatabase);
        bottomnav = findViewById(R.id.btnBottomNav);
        fragment = findViewById(R.id.btnFragment);

        explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });
        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ImplicitIntentActivity.class));
            }
        });
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InputActivity.class));
            }
        });
        roomdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RoomDataActivity.class));
            }
        });
        bottomnav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });
        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WithFragmentActivity.class));
            }
        });

    }
}