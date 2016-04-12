package com.example.afanasenko.lesson2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import static com.example.afanasenko.lesson2.R.*;
//import static com.example.afanasenko.lesson2.R.drawable.ic_launcher_button;
//import static com.example.afanasenko.lesson2.R.drawable.ic_launcher_button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Button mButton4 = new Button(MainActivity.this);
        Button mButton5 = new Button(MainActivity.this);
        Button mButton6 = new Button(MainActivity.this);

        SetButton(mButton4);
        SetButton(mButton5);
        SetButton(mButton6);

    }

    private void SetButton(Button mButton) {
        LinearLayout mLayout = (LinearLayout)findViewById(id.vertical_code);

        String mText = getResources().getString(R.string.some_text);

        LinearLayout.LayoutParams mLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mLayoutParams.setMargins(5,5,5,5);

        mButton.setLayoutParams(mLayoutParams);
        mButton.setBackgroundColor(Color.WHITE);
        mButton.setText(mText);
        mButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_launcher_button, 0, 0, 0);
        mButton.setPadding(0,0,0,0);

        mLayout.addView(mButton);

    }
}
