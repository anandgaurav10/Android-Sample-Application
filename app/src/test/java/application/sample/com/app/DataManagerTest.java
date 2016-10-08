package application.sample.com.app;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import application.sample.com.app.data.DataManager;
import application.sample.com.app.data.local.PreferencesHelper;

/**
 * Created by amitshekhar on 08/10/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class DataManagerTest {

    @Mock
    PreferencesHelper mMockPreferencesHelper;
    DataManager mDataManager;

    @Before
    public void setUp() {
        mDataManager = new DataManager(mMockPreferencesHelper);
    }

}