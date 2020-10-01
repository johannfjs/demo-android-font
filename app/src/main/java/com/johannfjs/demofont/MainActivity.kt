package com.johannfjs.demofont

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvOne.typeface = Typeface.createFromAsset(assets, "arial.ttf")
        tvTwo.typeface = Typeface.createFromAsset(assets, "COMIC.TTF")
        tvThree.typeface = Typeface.createFromAsset(assets, "verdana.ttf")
    }
}