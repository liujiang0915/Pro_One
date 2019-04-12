package com.baway.day02.loginmvp;

public class LoginModle implements ILoginModle {
    @Override
    public void login(CallBack callBack) {
        String names="我家有狗刚养成！！！";
        int cades=1232134;
        callBack.onSeccess(names,cades);

    }
}
