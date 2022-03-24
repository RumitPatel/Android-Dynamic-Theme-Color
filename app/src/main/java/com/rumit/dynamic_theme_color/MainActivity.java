package com.rumit.dynamic_theme_color;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new ThemeColors(this);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        int red = new Random().nextInt(255);
        int green = new Random().nextInt(255);
        int blue = new Random().nextInt(255);
        ThemeColors.setNewThemeColor(MainActivity.this, red, green, blue);
    }
}