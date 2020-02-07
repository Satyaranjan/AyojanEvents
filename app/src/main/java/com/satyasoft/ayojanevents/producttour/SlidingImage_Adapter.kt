package com.satyasoft.ayojanevents.producttour


import android.R
import android.content.Context
import android.os.Parcelable
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import java.util.*


class SlidingImage_Adapter(
    private val context: Context,
    private val images: ArrayList<Int>) :
    PagerAdapter() {
    private val inflater: LayoutInflater
    override fun destroyItem(
        container: ViewGroup,
        position: Int,
        `object`: Any
    ) {
        container.removeView(`object` as View)
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout: View =
            inflater.inflate(R.layout.slidingimages_layout, view, false)!!
        val imageView = imageLayout
            .findViewById<View>(R.id.image) as ImageView
        imageView.setImageResource(images[position])
        view.addView(imageLayout, 0)
        return imageLayout
    }

    override fun isViewFromObject(
        view: View,
        `object`: Any
    ): Boolean {
        return view == `object`
    }

    override fun restoreState(
        state: Parcelable?,
        loader: ClassLoader?
    ) {
    }

    override fun saveState(): Parcelable? {
        return null
    }

    init {
        inflater = LayoutInflater.from(context)
    }
}