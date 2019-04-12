package com.baway.day02.loginmvp;

public interface ILoginModle {
    //业务数据处理  数据库  网络数据

    /**
     * 定义接口
     * @param callBack
     */

    void  login(CallBack callBack);

    interface CallBack{
        void onSeccess(String names,int cade);

        void onFail();
    }
}
