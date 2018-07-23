package com.aula1.movile.movilenext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.aula1.movile.movilenext.chronometer.ChronometerActivity;
import com.aula1.movile.movilenext.livedata.LiveDataActivity;
import com.aula1.movile.movilenext.seekbar.SeekBarActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonChronometer = (Button) findViewById(R.id.buttonChronometer);
        Button buttonLiveData = (Button) findViewById(R.id.buttonLiveData);
        Button buttonSeekbar = (Button) findViewById(R.id.buttonSeekbar);

        buttonChronometer.setOnClickListener(v -> {
            startActivity(new Intent(this, ChronometerActivity.class));
        });

        buttonLiveData.setOnClickListener(v -> {
            startActivity(new Intent(this, LiveDataActivity.class));
        });

        buttonSeekbar.setOnClickListener(v -> {
            startActivity(new Intent(this, SeekBarActivity.class));
        });
    }
}
