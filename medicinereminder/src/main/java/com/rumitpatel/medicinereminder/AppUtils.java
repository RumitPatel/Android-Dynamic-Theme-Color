package com.rumitpatel.medicinereminder;

import android.content.Context;
import android.widget.Toast;

public class AppUtils {
    public void showToast(Context context, String message) {
        System.out.println("method called from lib");
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}