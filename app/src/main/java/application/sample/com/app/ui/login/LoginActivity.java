package application.sample.com.app.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import application.sample.com.app.R;
import application.sample.com.app.ui.base.BaseActivity;
import butterknife.ButterKnife;

/**
 * Created by amitshekhar on 07/10/16.
 */

public class LoginActivity extends BaseActivity {

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}
