package com.rumit.dynamic_theme_color;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.rumitpatel.medicinereminder.AppUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        AppUtils appUtils = new AppUtils();
        appUtils.showToast(this, "My message");
    }
}