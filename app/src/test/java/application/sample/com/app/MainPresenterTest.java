package application.sample.com.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import application.sample.com.app.ui.main.MainMvpView;
import application.sample.com.app.ui.main.MainPresenter;

import static org.mockito.Mockito.verify;

/**
 * Created by amitshekhar on 08/10/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainPresenterTest {

    @Mock
    MainMvpView mMockMvpView;

    private MainPresenter mPresenter;

    @Before
    public void setUp() {
        mPresenter = new MainPresenter();
        mPresenter.attachView(mMockMvpView);
    }

    @After
    public void detachView() {
        mPresenter.detachView();
    }

    @Test
    public void doSomeThing() {
        mPresenter.doSomeThing();
        verify(mMockMvpView).onSomeThingDone();
    }

}