package com.aula1.movile.movilenext.seekbar;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SeekBarViewModel extends ViewModel {

    public MutableLiveData<Integer> seekBarValue = new MutableLiveData<>();

}
