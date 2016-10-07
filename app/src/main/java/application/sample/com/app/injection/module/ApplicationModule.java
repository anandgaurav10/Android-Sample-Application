package application.sample.com.app.injection.module;

import android.app.Application;
import android.content.Context;

import application.sample.com.app.injection.ApplicationContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by amitshekhar on 06/10/16.
 */

/**
 * Provide application-level dependencies. Mainly singleton object that can be injected from
 * anywhere in the app.
 */
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

}
