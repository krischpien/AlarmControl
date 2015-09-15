package cz.ampertech.remotedevicemanager.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import cz.ampertech.remotedevicemanager.view.fragment.RemoteControlPageFragment;

/**
 * Created by Jan on 15.09.2015.
 */
public class RemoteControlPageAdapter extends FragmentPagerAdapter {


    List<RemoteControlPageFragment> fragmentPages = null;

    public RemoteControlPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public RemoteControlPageAdapter(FragmentManager fm, List<RemoteControlPageFragment> fragmentPages){
        super(fm);
        this.fragmentPages = fragmentPages;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentPages.get(position);
    }

    @Override
    public int getCount() {
        return fragmentPages.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentPages.get(position).getRemoteControlLocation().getLocation();
    }
}
