package com.example.jorge.forest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.prefs.Preferences;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void btnSettings_onClick(View view) {
        Intent intent = new Intent(this, ForestSettings.class);
        startActivity(intent);
    }

    public void btnRead_onClick(View view) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Boolean sSetting = prefs.getBoolean("audio_service_status", true);
        String s = sSetting.toString();
        Toast.makeText(this, s,Toast.LENGTH_LONG).show();
    }
}
