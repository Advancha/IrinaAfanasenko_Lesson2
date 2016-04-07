package com.example.afanasenko.lesson2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        LinearLayout progLayout = (LinearLayout)findViewById(id.vertical_code);

        Button Button4 = new Button(MainActivity.this);
        Drawable img_btn = ContextCompat.getDrawable(this, R.drawable.ic_launcher_button);
        String text_btn = getResources().getString(R.string.some_text);

        //Button4.setLayoutParams(Button1.getLayoutParams());
 //       Button4.setBackground(Button1.getBackground());
        Button4.setText(text_btn);
        Button4.setCompoundDrawables(img_btn, null,null,null);

        //Button4.setBackground(ic_launcher_button);
       // ViewGroup.LayoutParams imageViewLayoutParams = new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        //imageView.setLayoutParams(imageViewLayoutParams);

        progLayout.addView(Button4);
    }
}
