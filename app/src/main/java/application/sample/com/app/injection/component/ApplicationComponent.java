package application.sample.com.app.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import application.sample.com.app.MyApplication;
import application.sample.com.app.injection.ApplicationContext;
import application.sample.com.app.injection.module.ApplicationModule;
import dagger.Component;

/**
 * Created by amitshekhar on 06/10/16.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication myApplication);

    @ApplicationContext
    Context context();

    Application application();
}
