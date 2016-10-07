package application.sample.com.app.ui.splash;

import javax.inject.Inject;

import application.sample.com.app.data.DataManager;
import application.sample.com.app.ui.base.Presenter;

/**
 * Created by amitshekhar on 07/10/16.
 */

public class SplashPresenter implements Presenter<SplashMvpView> {


    private SplashMvpView mMvpView;

    @Inject
    DataManager mDataManager;

    @Inject
    public SplashPresenter() {
    }

    @Override
    public void attachView(SplashMvpView mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public void checkLoggedInStatus() {
        mMvpView.onLoggedInStatus(mDataManager.getPreferencesHelper().getIsLoggedIn());
    }
}
