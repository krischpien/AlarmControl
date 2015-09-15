package cz.ampertech.remotedevicemanager.view.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cz.ampertech.remotedevicemanager.R;

/**
 * Created by Jan on 14.09.2015.
 */
public class ControlDetailFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_control_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View rootView = getView();
    }
}
