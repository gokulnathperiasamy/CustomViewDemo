package com.kpgn.customviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomView extends LinearLayout {

    TextView mTopicHeader;
    TextView mLongDescription;

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomView, 0, 0);
        String titleText = a.getString(R.styleable.CustomView_titleText);
        String longDescription = a.getString(R.styleable.CustomView_longDescription);
        a.recycle();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (inflater != null) {
            inflater.inflate(R.layout.view_custom, this, true);

            mTopicHeader = findViewById(R.id.tv_topic_header);
            setTopicHeader(titleText);

            mLongDescription = findViewById(R.id.tv_long_description);
            setLongDescription(longDescription);
        }
    }

    public CustomView(Context context) {
        this(context, null);
    }

    public void setTopicHeader(String topicHeader) {
        mTopicHeader.setText(topicHeader);
    }

    public void setLongDescription(String longDescription) {
        mLongDescription.setText(longDescription);
    }

}