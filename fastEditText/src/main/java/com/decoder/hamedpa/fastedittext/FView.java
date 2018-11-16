package com.decoder.hamedpa.fastedittext;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by HamedPa on 11/16/2018.
 */
/**Developed by Hamed PariAzar 2018
 *for more info You can read Document from
 * http://github.com/hamedpa
 * */
public class FView extends android.support.v7.widget.AppCompatEditText {
    private Context c;
    public FView(Context context) {
        super(context);
        c = context;
        this.setBackgroundResource(R.drawable.back);
    }

    public FView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        c = context;
        this.setBackgroundResource(R.drawable.back);

    }

    public FView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        c = context;
        this.setBackgroundResource(R.drawable.back);

    }
     public void startAnimations(int selectAnim,View target,boolean color){
        if(color)
            this.setBackgroundResource(R.drawable.ripple);
        initAnim(selectAnim, target);
    }
    public void startAnimations(int selectAnim,View target){
        initAnim(selectAnim, target);
    }
    public void startAnimations(int selectAnim){
        initAnim(selectAnim);
    }

    private void initAnim(int selectAnim, View target) {
        Animation anim;
        int repeatTime = 2;
        int[] sel = defineAnimPath();
        anim = AnimationUtils.loadAnimation(c, sel[selectAnim+1]);
        this.animate().alpha(1.21f).setDuration(2600);
        anim.setRepeatCount(Animation.INFINITE);
        anim.reset();
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(5);
        ObjectAnimator anim22 = (ObjectAnimator) AnimatorInflater.loadAnimator(c, R.animator.hive);
        anim22.setTarget(target);
        anim22.setDuration(3000);
        this.startAnimation(anim);
        anim22.start();
    }
    private void initAnim(int selectAnim) {
        Animation anim;
        int repeatTime = 2;
        int[] sel = defineAnimPath();
        anim = AnimationUtils.loadAnimation(c, sel[selectAnim+1]);
        this.startAnimation(anim);
    }


    private int[] defineAnimPath() {
        return new int[]{
                    R.anim.animator
                    ,R.anim.zoom
                    ,R.anim.blink
                    ,R.anim.move
                    ,R.anim.fadein
                    ,R.anim.zoomout
                    ,R.anim.fadein
                    ,R.anim.rotate
                    ,R.anim.slide_down
                    ,R.anim.slideup
                    ,R.anim.bounce
                    ,R.anim.sequential
                    ,R.anim.together};
    }

    public void startAnimations(int firstanim,int secondanim){
        int[] sel = defineAnimPath();
        Animation anim = AnimationUtils.loadAnimation(c, sel[firstanim+1]);
        this.startAnimation(anim);
        Animation anim2 = AnimationUtils.loadAnimation(c, sel[secondanim+1]);
        this.startAnimation(anim2);

        }
    }

