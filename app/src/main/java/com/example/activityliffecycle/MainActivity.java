package com.example.activityliffecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //when start activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() { //when loading a screen this is second
        super.onStart();
    }

    @Override
    protected void onResume() { //after render data then call it
        super.onResume();
    }

    @Override
    protected void onPause() { //when close the app on puse call
        super.onPause();
    }

    @Override
    protected void onStop() { //after puse then call onstop
        super.onStop();
    }

    @Override
    protected void onRestart() { //again call then app then it call
        super.onRestart();
    }

    @Override
    protected void onDestroy() { //when exit then app its call destroy
        super.onDestroy();
    }
}