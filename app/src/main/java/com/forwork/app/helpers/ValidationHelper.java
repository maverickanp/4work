package com.forwork.app.helpers;

import android.text.TextUtils;

public class ValidationHelper {
    public static boolean isEmailValid(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}