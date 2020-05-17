package com.example.android.tourindia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int tabs) {
        super(fm);
        this.numOfTabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HistoricalFragment historicalFragment = new HistoricalFragment();
                return historicalFragment;
            case 1:
                BeachFragment beachFragment = new BeachFragment();
                return beachFragment;
            case 2:
                HillStationFragment hillStationFragment = new HillStationFragment();
                return hillStationFragment;
            case 3:
                CityFragment cityFragment = new CityFragment();
                return cityFragment;
            case 4:
                AboutFragment aboutFragment = new AboutFragment();
                return aboutFragment;
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
