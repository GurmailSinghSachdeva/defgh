package com.example.a1wew4g3.defgh.activity

import android.os.Bundle
import com.example.a1wew4g3.defgh.R

class AllChatsActivity : BaseActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_grid_people)


//        root.getViewTreeObserver().addOnPreDrawListener(object : ViewTreeObserver.OnPreDrawListener {
//            override fun onPreDraw(): Boolean {
//                root.getViewTreeObserver().removeOnPreDrawListener(this)
//
//                Blurry.with(baseContext).radius(25).sampling(2).onto(root)
//                return true
//            }
//        })
//        Blurry.with(baseContext).radius(25).sampling(2).onto(root)

//        Blurry.with(this)
//                .radius(10)
//                .sampling(8)
//                .async()
//                .capture(findViewById(R.id.iv))
//                .into(findViewById(R.id.iv2))

//        btn.setOnClickListener{
//            gg.visibility = View.GONE
//        }

//        val i = Intent(this, MainActivity::class.java )
//
//        startActivity(i)
    }

    override fun onPause() {
        super.onPause()
//        Blurry.with(baseContext).radius(25).sampling(2).onto(root)

    }
}
