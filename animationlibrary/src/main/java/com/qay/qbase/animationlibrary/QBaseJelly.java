package com.qay.qbase.animationlibrary;

import android.animation.ObjectAnimator;
import android.view.View;

public class QBaseJelly extends QBaseAnimatorSet {
	public QBaseJelly() {
		duration = 700;
	}

	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "scaleX", 0.3f, 0.5f, 0.9f, 0.8f, 0.9f, 1),//
				ObjectAnimator.ofFloat(view, "scaleY", 0.3f, 0.5f, 0.9f, 0.8f, 0.9f, 1),//
				ObjectAnimator.ofFloat(view, "alpha", 0.2f, 1));
	}
}
