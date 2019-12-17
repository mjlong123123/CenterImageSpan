package com.dragon.centerimagespan

import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.DynamicDrawableSpan.*
import android.text.style.ImageSpan
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val option = BitmapFactory.Options()
        option.inSampleSize = 2
        val b = BitmapFactory.decodeResource(resources, R.drawable.image, option)
        option.inSampleSize = 8
        val b2 = BitmapFactory.decodeResource(resources, R.drawable.image, option)
        val span1 = SpannableStringBuilder("replace ImageSpan \n baseline ")
        span1.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_BASELINE
            ), 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span1.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_BASELINE
            ), span1.length - 1, span1.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span1.setSpan(
            BackgroundColorSpan(Color.GREEN),
            0,
            span1.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text1.text = span1
        val span2 = SpannableStringBuilder("replace ImageSpan \n bottom ")
        span2.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_BOTTOM
            ), 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span2.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_BOTTOM
            ), span2.length - 1, span2.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span2.setSpan(
            BackgroundColorSpan(Color.GREEN),
            0,
            span2.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text2.text = span2

        val span3 = SpannableStringBuilder("replace ImageSpan \n center ")
        span3.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_CENTER
            ), 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span3.setSpan(
            ImageSpan(
                this,
                b,
                ALIGN_CENTER
            ), span3.length - 1, span3.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span3.setSpan(
            BackgroundColorSpan(Color.GREEN),
            0,
            span3.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text3.text = span3


        val span4 = SpannableStringBuilder("replace   CenterImageSpan \n center ")
        span4.setSpan(
            CenterImageSpan(
                this,
                b
            ), 0, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span4.setSpan(
            CenterImageSpan(
                this,
                b2
            ), 8, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span4.setSpan(
            CenterImageSpan(
                this,
                b
            ), span4.length - 1, span4.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        span4.setSpan(
            BackgroundColorSpan(Color.GREEN),
            0,
            span4.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        text4.text = span4
    }
}
