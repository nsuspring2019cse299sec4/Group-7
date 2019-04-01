package com.example.pizzaorder;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ImageAdapter extends BaseAdapter {

    int mGalleryItemBackground;
    private Context mContext;

    private Integer[] mImageIds = {
            R.drawable.anchovies,
            R.drawable.bacon,
            R.drawable.bananapepper,
            R.drawable.blackolives,
            R.drawable.chicken,
            R.drawable.greenpeppers,
            R.drawable.ham,
            R.drawable.jalapenopeppers,
            R.drawable.mozzarella,
            R.drawable.mushrooms,
            R.drawable.onion,
            R.drawable.pepperoni,
            R.drawable.pineapple,
            R.drawable.sausage,
            R.drawable.tomatoes,
    };

    public ImageAdapter(Context c) {
        mContext = c;
        TypedArray a = c.obtainStyledAttributes(R.styleable.HelloGallery);
        mGalleryItemBackground = a.getResourceId(
                R.styleable.HelloGallery_android_galleryItemBackground, 0);
        a.recycle();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
