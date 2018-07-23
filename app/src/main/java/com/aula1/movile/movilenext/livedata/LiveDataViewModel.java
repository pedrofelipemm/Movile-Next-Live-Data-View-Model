package com.aula1.movile.movilenext.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.SystemClock;

import java.util.Timer;
import java.util.TimerTask;

public class LiveDataViewModel extends ViewModel {

    private MutableLiveData<Long> elapsedTime = new MutableLiveData<>();

    private static final int ONE_SECOND = 1000;

    private long initialTime;

    public LiveDataViewModel() {
        initialTime = SystemClock.elapsedRealtime();
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                final long newValue = (SystemClock.elapsedRealtime() - initialTime) / 1000;

                elapsedTime.postValue(newValue);
            }
        }, ONE_SECOND, ONE_SECOND);
    }

    public MutableLiveData<Long> getElapsedTime() {
        return elapsedTime;
    }
}
