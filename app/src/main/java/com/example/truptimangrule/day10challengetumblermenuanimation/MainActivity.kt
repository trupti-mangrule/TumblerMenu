package com.example.truptimangrule.day10challengetumblermenuanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    var rotate:Animation?=null
    var rotate1:Animation?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_animate.setOnClickListener({
            btn_stop_animation.visibility = View.VISIBLE
            btn_animate.visibility = View.INVISIBLE
            startAnim()
        })
        btn_stop_animation.setOnClickListener({
            btn_animate.visibility = View.VISIBLE
            btn_stop_animation.visibility = View.INVISIBLE
            stopAnim()
        })

    }
     fun startAnim(){
         rotate = AnimationUtils.loadAnimation( this,R.anim.left_to_center_animation);
        cl_1.startAnimation(rotate)
        cl_2.startAnimation(rotate)
        cl_3.startAnimation(rotate)
         rotate1 = AnimationUtils.loadAnimation( this,R.anim.right_to_center_animation);
        cl_4.startAnimation(rotate1);
        cl_5.startAnimation(rotate1);
        cl_6.startAnimation(rotate1);
    }
    fun stopAnim(){
        cl_1.clearAnimation()
        cl_2.clearAnimation()
        cl_3.clearAnimation()
        cl_4.clearAnimation()
        cl_5.clearAnimation()
        cl_6.clearAnimation()

    }
}
