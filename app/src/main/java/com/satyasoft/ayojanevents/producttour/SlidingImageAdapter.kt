package com.satyasoft.ayojanevents.producttour

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.satyasoft.ayojanevents.R
import com.squareup.picasso.Picasso
import java.util.*


class SlidingImageAdapter(
    private val context: Context,
    private val images: ArrayList<String>) :
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
       // imageView.setImageResource(images[position])
        val picasso = Picasso.get()
       // for (i in 0 until images.size){
            picasso.load(images[position])
                .into(imageView)
      //  }


        // ImageLoader class instance
        // ImageLoader class instance
      //  val imgLoader = ImageLoader(context)

        // whenever you want to load an image from url
        // call DisplayImage function
        // url - image url to load
        // loader - loader image, will be displayed before getting image
        // image - ImageView
        // whenever you want to load an image from url
// call DisplayImage function
// url - image url to load
// loader - loader image, will be displayed before getting image
// image - ImageView
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