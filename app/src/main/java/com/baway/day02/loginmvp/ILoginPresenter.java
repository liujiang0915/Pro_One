package com.baway.day02.loginmvp;

public interface ILoginPresenter {
    /*
        presenter 提供view与model交互纽带
     */
    void getModel();
    //绑定
    void attch(ILoginView view);
    //解绑
    void  detch();
}
