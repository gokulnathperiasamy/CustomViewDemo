package com.kpgn.customviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomView mCustomView02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomView02 = (CustomView) findViewById(R.id.cv_view02);
        mCustomView02.setTopicHeader("New Long Header...");
        mCustomView02.setLongDescription("Longest Description... New..");
    }
}
