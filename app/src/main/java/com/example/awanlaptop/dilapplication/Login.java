package com.example.awanlaptop.dilapplication;

import android.content.ContentValues;

/**
 * Created by awan laptop on 7/19/2017.
 */

public class Login {
    private String _email;
    private String _password;



    public Login() {

    }

    public Login(String email,String password) {
        this._email = email;
        this._password = password;
    }




    public void set_email(String email) {
        this._email = email;
    }

    public void set_password(String password) {
        this._password = password;
    }

    public String get_email() {
        return _email;
    }

    public String get_password() {
        return _password;
    }
}
