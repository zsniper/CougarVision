package ca.cb.cc.cv.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

// Custom font view

public class TextViewF extends TextView {

public TextViewF(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init();
}

public TextViewF(Context context, AttributeSet attrs) {
    super(context, attrs);
    init();
}

public TextViewF(Context context) {
    super(context);
    init();
}

public void init() {

    Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/opensans.ttf");
    setTypeface(tf ,1);

}

}


