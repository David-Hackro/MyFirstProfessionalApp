package com.tutorials.hackro.myfirstprofessionalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ListProfilesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_profiles);
        Log.e("nhdbjhf",BuildConfig.BASE_URL);
    }
}
