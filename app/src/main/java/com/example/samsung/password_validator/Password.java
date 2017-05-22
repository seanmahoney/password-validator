package com.example.samsung.password_validator;

/**
 * Created by Samsung on 5/22/2017.
 */

public class Password {

    public static boolean validate(String userInputForPassword){
        if(userInputForPassword.toLowerCase().equals("password"))
            return false;
        else if
                (userInputForPassword.length()<8)
                return false;
        else
            return true;

    }
}

