package com.baway.day02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.baway.day02.loginmvp.ILoginView;
import com.baway.day02.loginmvp.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText login_name_et;
    private EditText login_pwd_et;
    private Button login_bt;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_name_et = findViewById(R.id.login_name_et);
        login_pwd_et = findViewById(R.id.login_pwd_et);
        login_bt = findViewById(R.id.login_bt);

        loginPresenter = new LoginPresenter();
        loginPresenter.attch(this);
    }

    @Override
    public void getPresenter(String name,int cade) {

        login_name_et.setText(name);
        login_pwd_et.setText(cade+"");
    }
}
