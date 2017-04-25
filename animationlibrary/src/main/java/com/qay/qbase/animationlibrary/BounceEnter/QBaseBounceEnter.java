package com.qay.qbase.animationlibrary.BounceEnter;

import android.animation.ObjectAnimator;
import android.view.View;

import com.qay.qbase.animationlibrary.QBaseAnimatorSet;

public class QBaseBounceEnter extends QBaseAnimatorSet {

	public QBaseBounceEnter() {
		duration = 700;
	}

	@Override
	public void setAnimation(View view) {

		animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0, 1, 1, 1), //
				ObjectAnimator.ofFloat(view, "scaleX", 0.5f, 1.05f, 0.95f, 1),//
				ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1.05f, 0.95f, 1));
		/**
		 * <pre>
		 * ObjectAnimator oa_alpha = ObjectAnimator.ofFloat(view, "alpha", 0.2f, 1).setDuration(90);
		 * 
		 * AnimatorSet as1 = new AnimatorSet();
		 * as1.playTogether(oa_alpha, ObjectAnimator.ofFloat(view, "scaleX", 0.7f, 1.05f).setDuration(135),//
		 * 		ObjectAnimator.ofFloat(view, "scaleY", 0.7f, 1.05f).setDuration(135));
		 * 
		 * AnimatorSet as2 = new AnimatorSet();
		 * as2.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.05f, 0.95f).setDuration(105), //
		 * 		ObjectAnimator.ofFloat(view, "scaleY", 1.05f, 0.95f).setDuration(105));
		 * 
		 * AnimatorSet as3 = new AnimatorSet();
		 * as3.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 0.95f, 1f).setDuration(60),//
		 * 		ObjectAnimator.ofFloat(view, "scaleY", 0.95f, 1f).setDuration(60));
		 * 
		 * animatorSet.playSequentially(as1, as2, as3);
		 * </pre>
		 * 
		 */
	}
}
