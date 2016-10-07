package application.sample.com.app.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

import application.sample.com.app.injection.ApplicationContext;

/**
 * Created by amitshekhar on 07/10/16.
 */

@Singleton
public class PreferencesHelper {

    private static final String PREF_FILE_NAME = "sample_app_pref_file";
    private static final String IS_LOGGED_IN = "IS_LOGGED_IN";
    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void clear() {
        mPref.edit().clear().apply();
    }

    public void putLoggedIn(boolean loggedIn) {
        mPref.edit().putBoolean(IS_LOGGED_IN, loggedIn).apply();
    }

    public boolean getIsLoggedIn() {
        return mPref.getBoolean(IS_LOGGED_IN, false);
    }

}
