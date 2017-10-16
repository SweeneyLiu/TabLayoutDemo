package com.lsw.tablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2017/10/16 0016.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    private static final String[] mTitles = {"关注", "推荐", "热点", "国际", "头条", "社会", "娱乐", "体育", "科技", "财经"};

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(mTitles[position]);
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
