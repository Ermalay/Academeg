package ru.novil.sergey.navigationdraweractivity.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import ru.novil.sergey.navigationdraweractivity.MainActivity;
import ru.novil.sergey.navigationdraweractivity.R;
import ru.novil.sergey.navigationdraweractivity.sqlite.MyAsyncTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final MyAsyncTask myAsyncTask = new MyAsyncTask();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();

                myAsyncTask.execute();
            }
        }, 3*1000);
    }
}
