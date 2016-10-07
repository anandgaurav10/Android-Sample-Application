package application.sample.com.app.injection.component;

import application.sample.com.app.injection.PerActivity;
import application.sample.com.app.injection.module.ActivityModule;
import application.sample.com.app.ui.login.LoginActivity;
import application.sample.com.app.ui.main.MainActivity;
import application.sample.com.app.ui.splash.SplashActivity;
import dagger.Component;

/**
 * Created by amitshekhar on 06/10/16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
    void inject(SplashActivity splashActivity);
    void inject(LoginActivity loginActivity);

}
