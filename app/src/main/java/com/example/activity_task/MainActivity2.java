package com.example.activity_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Log.d("activity-lifecycle","onCreate invoked in activity2");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activity-lifecycle","onStart invoked in activity2");


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity-lifecycle","onResume invoked in activity2");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity-lifecycle","onPause invoked in activity2");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activity-lifecycle","onStop invoked in activity2");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activity-lifecycle","onRestart invoked in activity2");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity-lifecycle","onDestroy invoked in activity2");
    }

}