package com.midnight.midnightcontrol;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Midnightrom extends PreferenceActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.midnight_pref);
    }

}
