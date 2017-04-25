package com.qay.qbase.animationlibrary.FlipEnter;

import android.animation.ObjectAnimator;
import android.view.View;

import com.qay.qbase.animationlibrary.QBaseAnimatorSet;

public class QBaseFlipHorizontalEnter extends QBaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				// ObjectAnimator.ofFloat(view, "rotationY", -90, 0));
				ObjectAnimator.ofFloat(view, "rotationY", 90, 0));
	}
}
