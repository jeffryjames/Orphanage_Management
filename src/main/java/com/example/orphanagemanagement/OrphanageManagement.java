package com.example.orphanagemanagement;

import android.app.Application;

import com.firebase.client.Firebase;

public class OrphanageManagement extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Firebase.setAndroidContext(this);
    }

}
