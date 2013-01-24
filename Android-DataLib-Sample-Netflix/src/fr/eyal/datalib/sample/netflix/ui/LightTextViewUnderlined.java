package fr.eyal.datalib.sample.netflix.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class LightTextViewUnderlined extends TextView {

	Paint mLinePaint = null;
	
	public LightTextViewUnderlined(Context context) {
		super(context);
		init(context);
	}

	public LightTextViewUnderlined(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public LightTextViewUnderlined(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	private void init(Context context) {
		if(!isInEditMode())
			setTypeface(Typeface.createFromAsset(context.getAssets(),"Roboto-Light.ttf"));
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
		
		if(mLinePaint == null){
			mLinePaint = new Paint();
			mLinePaint.setColor(getPaint().getColor());
			mLinePaint.setStrokeWidth(2);
		}
//		getPaint().setStrokeWidth(1);
//		getPaint().setStyle(Style.STROKE);
		
		canvas.drawLine(0, getHeight()-1, getWidth(), getHeight()-1, mLinePaint);
	}


}
