package application.sample.com.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import application.sample.com.app.data.DataManager;
import application.sample.com.app.ui.splash.SplashMvpView;
import application.sample.com.app.ui.splash.SplashPresenter;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

/**
 * Created by amitshekhar on 08/10/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class SplashPresenterTest {

    @Mock
    SplashMvpView mMockMvpView;
    @Mock
    DataManager mMockDataManager;
    private SplashPresenter mPresenter;

    @Before
    public void setUp() {
        mPresenter = new SplashPresenter(mMockDataManager);
        mPresenter.attachView(mMockMvpView);
    }

    @After
    public void detachView() {
        mPresenter.detachView();
    }

    @Test
    public void checkLoggedOut() {

        doReturn(false)
                .when(mMockDataManager)
                .getIsLoggedIn();

        mPresenter.checkLoggedInStatus();

        verify(mMockMvpView).onLoggedInStatus(false);

    }


    @Test
    public void checkLoggedIn() {

        doReturn(true)
                .when(mMockDataManager)
                .getIsLoggedIn();

        mPresenter.checkLoggedInStatus();

        verify(mMockMvpView).onLoggedInStatus(true);

    }
}