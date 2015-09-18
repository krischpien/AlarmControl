package cz.ampertech.remotedevicemanager.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cz.ampertech.remotedevicemanager.R;
import cz.ampertech.remotedevicemanager.entity.RemoteControlLocation;
import cz.ampertech.remotedevicemanager.service.RemoteControllerService;
import cz.ampertech.remotedevicemanager.service.impl.RemoteControllerMock;
import cz.ampertech.remotedevicemanager.view.adapter.RemoteControlPageAdapter;

/**
 * Created by Jan on 16.09.2015.
 */
public class RemoteControlFragment extends Fragment {

    private ViewPager viewPager = null;
    private RemoteControllerService remoteControllerService = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_remote_control, container, false);

        remoteControllerService = new RemoteControllerMock();
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        List<RemoteControlPageFragment> fragmentPages = new ArrayList<>();
        for(RemoteControlLocation rcLocation : remoteControllerService.getAllRemoteLocations()){
            fragmentPages.add(RemoteControlPageFragment.newInstance(rcLocation));
        }

        RemoteControlPageAdapter pageAdapter = new RemoteControlPageAdapter(getActivity().getSupportFragmentManager(), fragmentPages);
        viewPager.setAdapter(pageAdapter);

        return view;
    }
}
