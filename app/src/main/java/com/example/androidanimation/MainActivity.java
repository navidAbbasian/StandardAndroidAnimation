package com.example.androidanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="tag" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          final AlphaAnimation alphaAnimation=new AlphaAnimation(1,0);
//        alphaAnimation.setDuration(500);  milli second
//        alphaAnimation.setRepeatCount(5);
//        alphaAnimation.setFillAfter(true);  after end of animate keep the position
//        alphaAnimation.setRepeatMode(Animation.REVERSE);
//
//        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                Log.i(TAG, "onAnimationEnd: ");
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//                Log.i(TAG, "onAnimationRepeat: ");
//
//            }
//        });
//




//
//        final ScaleAnimation scaleAnimation=new ScaleAnimation(1,2,1,2,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//        scaleAnimation.setDuration(500);
//        scaleAnimation.setFillAfter(true);
//        scaleAnimation.setRepeatCount(Animation.INFINITE);
//        scaleAnimation.setRepeatMode(Animation.REVERSE);

//
//        final TranslateAnimation translateAnimation=new TranslateAnimation(0,-100,0,-500);
//        translateAnimation.setDuration(500);
//
//        *we can implement Interpolator and customize it
//        translateAnimation.setInterpolator(new AccelerateInterpolator()); set animate for moving
//



          final RotateAnimation rotateAnimation=new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f );
//        rotateAnimation.setDuration(400);
//        rotateAnimation.setFillAfter(true);
//        rotateAnimation.setRepeatCount(Animation.INFINITE);
//        rotateAnimation.setRepeatMode(Animation.INFINITE);


        //use more than one animation
        //use shareInterpolator for overload behaviors
         final AnimationSet animationSet=new AnimationSet(true);
         animationSet.setDuration(1000);
         animationSet.setInterpolator(new AccelerateInterpolator());
         animationSet.setFillAfter(true);
         animationSet.addAnimation(alphaAnimation);
         animationSet.addAnimation(rotateAnimation);




         final ImageView imageView=findViewById(R.id.iv_main);
         View playBtn=findViewById(R.id.btn_main);
         playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageView.startAnimation(animationSet);

            }
        });




    }
}