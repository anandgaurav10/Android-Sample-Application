package application.sample.com.app.ui.base;

/**
 * Created by amitshekhar on 06/10/16.
 */

/**
 * Every presenter in the app must either implement this interface or extend BasePresenter
 * indicating the MvpView type that wants to be attached with.
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
