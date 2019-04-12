package com.baway.day02.loginmvp;

import android.util.Log;
import android.view.View;

public class LoginPresenter implements ILoginPresenter{

    private LoginModle loginModle;
    public static final String TAG="LoginPreSenter";
    private ILoginView view;

    //获取Model
    @Override
    public void getModel() {

    }
    //view绑定
    @Override
    public void attch(final ILoginView view) {
        loginModle = new LoginModle();
        this.view=view;
        loginModle.login(new ILoginModle.CallBack() {
            @Override
            public void onSeccess(String names,int cades) {
                view.getPresenter(names,cades);
                Log.i(TAG, "onSeccess: "+names+cades);
            }

            @Override
            public void onFail() {

            }
        });

    }

    @Override
    public void detch() {

    }
}
