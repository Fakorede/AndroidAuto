package com.thefabdev.androidauto;

import android.app.Service;

import androidx.annotation.NonNull;
import androidx.car.app.CarAppService;
import androidx.car.app.Session;
import androidx.car.app.validation.HostValidator;

public class MyCarAppService extends CarAppService {
    @NonNull
    @Override
    public HostValidator createHostValidator() {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR;
    }

    @Override
    @NonNull
    public Session onCreateSession() {
        return new MyCarAppSession();
    }
}
