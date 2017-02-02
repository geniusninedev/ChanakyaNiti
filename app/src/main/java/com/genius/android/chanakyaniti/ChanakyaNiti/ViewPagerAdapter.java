package com.genius.android.chanakyaniti.ChanakyaNiti;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.genius.android.chanakyaniti.R;


/**
 * Created by Dev on 05-11-2016.
 */

public class ViewPagerAdapter extends PagerAdapter {
    // Declare Variables
    Context context;
    String[] rank;
    String[] country;


    LayoutInflater inflater;

    public ViewPagerAdapter(Context context, String[] country) {
        this.context = context;
        this.rank = rank;
        this.country = country;


    }

    @Override
    public int getCount() {
        return country.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtrank;
        TextView txtcountry;
        TextView txtpopulation;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.love, container,
                false);

        // Locate the TextViews in viewpager_item.xml

        txtcountry = (TextView) itemView.findViewById(R.id.love);


        // Capture position and set to the TextViews

        txtcountry.setText(country[position]);


        // Locate the ImageView in viewpager_item.xml

        // Capture position and set to the ImageView

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }


}