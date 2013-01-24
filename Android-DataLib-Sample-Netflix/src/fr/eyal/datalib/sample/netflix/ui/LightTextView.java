package fr.eyal.datalib.sample.netflix.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class LightTextView extends TextView {
	
	public LightTextView(Context context) {
		super(context);
		init(context);
	}

	public LightTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public LightTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	private void init(Context context) {
		if(!isInEditMode())
			setTypeface(Typeface.createFromAsset(context.getAssets(),"Roboto-Light.ttf"));
	}

}
