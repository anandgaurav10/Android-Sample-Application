package application.sample.com.app.data;

import javax.inject.Inject;
import javax.inject.Singleton;

import application.sample.com.app.data.local.PreferencesHelper;

/**
 * Created by amitshekhar on 07/10/16.
 */
@Singleton
public class DataManager {

    private final PreferencesHelper mPreferencesHelper;

    @Inject
    public DataManager(PreferencesHelper mPreferencesHelper) {
        this.mPreferencesHelper = mPreferencesHelper;
    }

    public PreferencesHelper getPreferencesHelper() {
        return mPreferencesHelper;
    }
}
