package com.example.a1wew4g3.defgh.view

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.widget.LinearLayout
import com.example.a1wew4g3.defgh.R
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.layout_text_image_status.view.*

private const val DEFAULT_IMAGE = 1

class StatusView :LinearLayout{


    constructor(context: Context?) : super(context){
        isInEditMode
        initLayout(R.layout.layout_text_image_status)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        isInEditMode
        initLayout(R.layout.layout_text_image_status)
        val a = context!!.theme.obtainStyledAttributes(attrs, R.styleable.StatusView,0, R.style.StatusView)
        val text = a.getText(R.styleable.StatusView_text)
        val src = a.getResourceId(R.styleable.StatusView_image, R.drawable.ic_circle)
        val imageColor = a.getResourceId(R.styleable.StatusView_imageColor, R.color.online)
        setStatus(text, imageColor, src)
//        setText(text)
//        setImageResource(src, imageColor)
    }


    private fun setStatus(text : CharSequence, imageColor: Int, src: Int){
        setText(text)
        setImageResource(src, imageColor)
    }
    fun setStatus(text : CharSequence, imageColor: Int){
        setText(text)
        setImageResource(DEFAULT_IMAGE, imageColor)
    }
    private fun setImageResource(src: Int, imageColor: Int) {
        ivStatusC.setColorFilter(ContextCompat.getColor(context, imageColor), android.graphics.PorterDuff.Mode.SRC_IN)
//        ivStatusC.setImageResource(ContextCompat.getDrawable(context, src))

    }
    private fun setText(text: CharSequence) {
        tvStatusC.text = text
    }

    private fun initLayout(layout: Int) {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(layout, this, true)
    }

}