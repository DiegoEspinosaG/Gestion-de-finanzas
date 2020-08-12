package gestion.de.finanzas.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import gestion.de.finanzas.Fragments.HistoryFragment;
import gestion.de.finanzas.Fragments.ReportFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new HistoryFragment();
            case 1:
                return new ReportFragment();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
