package ca.cb.cc.cv;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.util.LruCache;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

//Copy pasted code public for custom font

public class TypefaceSpan extends MetricAffectingSpan {

  private static LruCache<String, Typeface> sTypefaceCache =
          new LruCache<String, Typeface>(12);

  private Typeface mTypeface;

  public TypefaceSpan(Context context, String typefaceName) {
      mTypeface = sTypefaceCache.get(typefaceName);

      if (mTypeface == null) {
          mTypeface = Typeface.createFromAsset(context.getApplicationContext()
                  .getAssets(), String.format("fonts/%s", typefaceName));
          sTypefaceCache.put(typefaceName, mTypeface);
      }
  }
  
  @Override
  public void updateMeasureState(TextPaint p) {
      p.setTypeface(mTypeface);
      p.setFlags(p.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
  }

  @Override
  public void updateDrawState(TextPaint tp) {
      tp.setTypeface(mTypeface);
      tp.setFlags(tp.getFlags() | Paint.SUBPIXEL_TEXT_FLAG);
  }
}
