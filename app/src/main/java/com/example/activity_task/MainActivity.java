package com.example.activity_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("activity-lifecycle","onCreate invoked in activity1");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("activity-lifecycle","onStart invoked in activity1");


    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("activity-lifecycle","onResume invoked in activity1");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("activity-lifecycle","onPause invoked in activity1");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("activity-lifecycle","onStop invoked in activity1");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("activity-lifecycle","onRestart invoked in activity1");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("activity-lifecycle","onDestroy invoked in activity1");
    }

    public void homeNavigation(View view){
        Intent intent =new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

}