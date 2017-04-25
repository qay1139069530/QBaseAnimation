package com.qay.qbase.animationlibrary.FadeEnter;

import android.animation.ObjectAnimator;
import android.view.View;

import com.qay.qbase.animationlibrary.QBaseAnimatorSet;

public class QBaseFadeEnter extends QBaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 0, 1).setDuration(duration));
	}
}
