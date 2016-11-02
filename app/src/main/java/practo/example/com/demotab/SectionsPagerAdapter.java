package practo.example.com.demotab;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


/**
 * Created by Arpit Singhal on 10/24/2016.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public Context mContext;

    public SectionsPagerAdapter(Context context,FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).

        return MainActivity.PlaceholderFragment.newInstance(position + 1);

    }

    @Override
    public int getCount() {

        // Show 3 total pages.

        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {

            case 0:
                return "Recent Appointments";
            case 1:
                return "Doctors";
            case 2:
                return "Tab 3";
        }
        return null;
    }
}
