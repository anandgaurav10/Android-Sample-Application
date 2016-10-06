package application.sample.com.app.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import application.sample.com.app.R;
import application.sample.com.app.ui.base.BaseActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainMvpView {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainPresenter mMainPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }

    /*****
     * Bind View click
     *****/

    @OnClick(R.id.btnDoSomething)
    void onbtnDoSomethingClicked() {
        mMainPresenter.doSomeThing();
    }


    /*****
     * MVP View methods implementation
     *****/

    @Override
    public void onSomeThingDone() {
        Log.d(TAG, "onSomeThingDone");
    }


    /*****
     * others methods implementation
     *****/


    /*****
     * private helper methods
     *****/
}
