package com.qay.qbase.animationlibrary.ZoomExit;

import android.animation.ObjectAnimator;
import android.view.View;

import com.qay.qbase.animationlibrary.QBaseAnimatorSet;

public class QBaseZoomInExit extends QBaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.25f, 0),//
				ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.25f, 0),//
				ObjectAnimator.ofFloat(view, "alpha", 1, 0, 0));//
	}
}
