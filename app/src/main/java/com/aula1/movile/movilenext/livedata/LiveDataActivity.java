package com.aula1.movile.movilenext.livedata;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aula1.movile.movilenext.R;

public class LiveDataActivity extends AppCompatActivity {

    private TextView tvTimer;

    private LiveDataViewModel liveDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);

        tvTimer = findViewById(R.id.tvTimer);

        liveDataViewModel = ViewModelProviders
                .of(this)
                .get(LiveDataViewModel.class);

        subscribe();

    }

    private void subscribe() {
        final Observer<Long> elapsedTimeObserver = new Observer<Long>() {
            @Override
            public void onChanged(@Nullable Long time) {
                tvTimer.setText(getString(R.string.seconds, time));
            }
        };

        liveDataViewModel.getElapsedTime().observe(this, elapsedTimeObserver);
    }
}
