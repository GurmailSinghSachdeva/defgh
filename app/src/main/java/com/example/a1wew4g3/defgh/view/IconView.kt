package com.example.a1wew4g3.defgh.view

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import android.graphics.Typeface



/**
 * Created by a1wew4g3 on 08/12/17.
 */
class IconView: TextView{


    constructor(context: Context?) : super(context){
        initialise()
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        initialise()

    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        initialise()

    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes){
        initialise()

    }


    fun initialise(){

    }
}