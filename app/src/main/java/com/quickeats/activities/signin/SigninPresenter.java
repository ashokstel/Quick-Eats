package com.quickeats.activities.signin;

import com.quickeats.shared.MvpPresenter;

public interface SigninPresenter extends MvpPresenter<SigninView> {

    void handleLoginRequest(String email, String password,Object validations);
    void handleLaunchSignUpscreen();
    void handleLaunchForgetScreen();
    void setInjection(Object obj);
}
