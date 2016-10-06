package application.sample.com.app.injection.module;

import android.app.Activity;
import android.content.Context;

import application.sample.com.app.injection.ActivityContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 06/10/16.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    @ActivityContext
    Context providesContext() {
        return mActivity;
    }

}
