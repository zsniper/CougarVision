package ca.cb.cc.cv.views;

import ca.cb.cc.cv.resources.Resources;
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
	
	private void init() {
	    Typeface tf = Typeface.createFromAsset(getContext().getAssets(), Resources.FONT_ROBOTO_LIGHT);
	    setTypeface(tf, 1);
	}
	
}


