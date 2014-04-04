package ca.cb.cc.cv;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

//Copy pasted code public for custom font

public class TypefaceSpan extends MetricAffectingSpan {
	
	private static final LruCache<String, Typeface> TYPEFACE_CACHE =
          new LruCache<String, Typeface>(12);
	
	private final Typeface typeface;
	
	public TypefaceSpan(Context context, String typefaceName) {
		Typeface t = TYPEFACE_CACHE.get(typefaceName);
		
      	if (t == null) {
          	t = Typeface.createFromAsset(context.getApplicationContext()
                  .getAssets(), String.format("fonts/%s", typefaceName));
          	TYPEFACE_CACHE.put(typefaceName, t);
      	}
      	typeface = t;
	}
	
	@Override
  	public void updateMeasureState(TextPaint p) {
		p.setTypeface(typeface);
		p.setFlags(p.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
	}
	
	@Override
  	public void updateDrawState(TextPaint tp) {
		tp.setTypeface(typeface);
		tp.setFlags(tp.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
	}
	
}
