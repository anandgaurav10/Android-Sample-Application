package application.sample.com.app;

import android.app.Application;
import android.content.Context;

import com.androidnetworking.AndroidNetworking;

import application.sample.com.app.injection.component.ApplicationComponent;
import application.sample.com.app.injection.component.DaggerApplicationComponent;
import application.sample.com.app.injection.module.ApplicationModule;

/**
 * Created by amitshekhar on 06/10/16.
 */

public class MyApplication extends Application {

    ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
