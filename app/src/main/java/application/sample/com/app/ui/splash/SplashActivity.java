package application.sample.com.app.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import javax.inject.Inject;

import application.sample.com.app.R;
import application.sample.com.app.ui.base.BaseActivity;
import application.sample.com.app.ui.login.LoginActivity;
import application.sample.com.app.ui.main.MainActivity;
import butterknife.ButterKnife;

/**
 * Created by amitshekhar on 07/10/16.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    private static final String TAG = SplashActivity.class.getSimpleName();

    @Inject
    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        mSplashPresenter.attachView(this);
        mSplashPresenter.checkLoggedInStatus();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSplashPresenter.detachView();
    }

    /*****
     * Bind View click
     *****/


    /*****
     * MVP View methods implementation
     *****/

    @Override
    public void onLoggedInStatus(boolean loggedIn) {
        Intent intent;
        if (loggedIn) {
            intent = MainActivity.getStartIntent(SplashActivity.this);
        } else {
            intent = LoginActivity.getStartIntent(SplashActivity.this);
        }
        startActivity(intent);
        finish();
    }


    /*****
     * others methods implementation
     *****/


    /*****
     * private helper methods
     *****/


}
