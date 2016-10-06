package application.sample.com.app.ui.main;

import javax.inject.Inject;

import application.sample.com.app.ui.base.Presenter;

/**
 * Created by amitshekhar on 06/10/16.
 */

public class MainPresenter implements Presenter<MainMvpView> {

    private MainMvpView mMvpView;

    @Inject
    public MainPresenter() {

    }

    @Override
    public void attachView(MainMvpView mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public void doSomeThing() {
        // do something for longTime and then send completion to view
        mMvpView.onSomeThingDone();
    }
}
