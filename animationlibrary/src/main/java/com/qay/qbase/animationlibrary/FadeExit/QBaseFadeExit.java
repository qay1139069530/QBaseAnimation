package com.qay.qbase.animationlibrary.FadeExit;

import android.animation.ObjectAnimator;
import android.view.View;

import com.qay.qbase.animationlibrary.QBaseAnimatorSet;

public class QBaseFadeExit extends QBaseAnimatorSet {
	@Override
	public void setAnimation(View view) {
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "alpha", 1, 0).setDuration(duration));
	}
}
