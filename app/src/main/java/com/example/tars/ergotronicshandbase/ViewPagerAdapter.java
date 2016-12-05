package com.example.tars.ergotronicshandbase;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by TARS on 12/3/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    final int num_tabs = 2;
    private String tab_titles[] = new String[] {"Tab1", "Tab2", "Tab3"};
    Context context;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return num_tabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new WorkOrderMgrTab();
            case 1:
                return new PartLookupTab();

            default:
                return null;
        }
    }

}
